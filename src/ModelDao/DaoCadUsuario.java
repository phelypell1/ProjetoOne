package ModelDao;

import ModelBeans.BeansCadUsuario;
import ModelConnection.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoCadUsuario {

    BeansCadUsuario cadUser = new BeansCadUsuario();
    ConexaoDB conex = new ConexaoDB();
    ConexaoDB conexe = new ConexaoDB();
    String nomeCat;

    public void Cadastrar(BeansCadUsuario cadastro) {
        BuscaId(cadastro.getCategoria());
        conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into Usuarios(matricula, nomeUser, senha, email, categoria) values (?,?,?,?,?)");
            pst.setString(1, cadastro.getMatricula());
            pst.setString(2, cadastro.getUsername());
            pst.setString(3, cadastro.getSenha());
            pst.setString(4, cadastro.getEmail());
            pst.setInt(5, codId);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar !" + ex.getMessage());
        }
        conex.CloseConnection();
    }

    public BeansCadUsuario BuscaUsuario(BeansCadUsuario mod) {
        conex.Conection();
        conex.executaSQL("select * from Usuarios where matricula like'%" + mod.getPesquisa() + "%'");
        try {
               conex.rs.next();
           if (conex.rs.first()) {
                BuscaCategoria(conex.rs.getString("categoria"));
                mod.setIdUsuario(conex.rs.getInt("idUsuario"));
                mod.setMatricula(conex.rs.getString("matricula"));
                mod.setUsername(conex.rs.getString("nomeUser"));
                mod.setSenha(conex.rs.getString("senha"));
                mod.setEmail(conex.rs.getString("email"));
                mod.setCategoria(nomeCat);
                //mod.setCategoria(conex.rs.getString("Categoria"));
               
            }else{
                JOptionPane.showMessageDialog(null, "Nao Existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROOO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" + ex.getMessage());
        }

        conex.CloseConnection();
        return mod;
    }

    public void Editar(BeansCadUsuario editar) {
        BuscaId(editar.getCategoria());
        conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update Usuarios set matricula = ?, nomeUser = ?, senha = ?, email = ?, categoria = ? where idUsuario = ?");
            pst.setString(1, editar.getMatricula());
            pst.setString(2, editar.getUsername());
            pst.setString(3, editar.getSenha());
            pst.setString(4, editar.getEmail());
            pst.setInt(5, codId);
            pst.setInt(6, editar.getIdUsuario());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Editado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Editar.\n Consulte mensagem para decobrir o erro \n "+ex.getMessage());
        }
        conex.CloseConnection();
    }
    
    public void Excluir(BeansCadUsuario excluir){
        conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from Usuarios where idUsuario = ?");
            pst.setInt(1, excluir.getIdUsuario());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario Excluido com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex.getMessage());
        }
        
        conex.CloseConnection();
    }
    int codId;
    public void BuscaId(String  id){
        conex.Conection();
        
        conex.executaSQL("select * from CategoriaUser where descTipo ='"+id+"'");
        try {
            conex.rs.first();
            codId = conex.rs.getInt("idCategoria");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca Id"+ ex.getMessage());
        }
        
        conex.CloseConnection();
    }
    
    public void BuscaCategoria(String idCat){
        conexe.Conection();
        
        try {
            
        conexe.executaSQL("select * from CategoriaUser where idCategoria ='"+idCat+"'");
            conexe.rs.first();
            nomeCat = conexe.rs.getString("descTipo");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Busca Categoria"+ ex.getMessage());
        }
        conexe.CloseConnection();
    }
}
