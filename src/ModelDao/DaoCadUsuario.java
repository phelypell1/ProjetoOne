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
    
    public void Cadastrar(BeansCadUsuario cadastro){ 
       conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into Usuario(nomeUsuario, username, senha, email, categoria) values (?,?,?,?,?)");
            pst.setString(1, cadastro.getNomeUsuario());
            pst.setString(2, cadastro.getUsername());
            pst.setString(3, cadastro.getSenha());
            pst.setString(4, cadastro.getEmail());
            pst.setString(5, cadastro.getCategoria());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar !"+ex.getMessage());
        }
        conex.ExitConnection();
    }
    
    public void Editar(BeansCadUsuario editar){
        
        conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update Usuario set nomeUsuario = ?, username = ?, senha = ?, email = ?, categoria = ?");
            pst.setString(1, editar.getNomeUsuario());
            pst.setString(2, editar.getUsername());
            pst.setString(3, editar.getSenha());
            pst.setString(4, editar.getEmail());
            pst.setString(5, editar.getCategoria());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Editado com sucesso !");
        } catch (SQLException ex) {
            Logger.getLogger(DaoCadUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.ExitConnection();
    }
    
    public BeansCadUsuario pesquisa(BeansCadUsuario pesquisa){
        conex.Conection();
        conex.ExecutaSQL("select * from Usuario where username like '%"+pesquisa.getNomeUsuario()+"%'");
        try {
            conex.rs.first();
            pesquisa.setIdUsuario(conex.rs.getInt("idUsuario"));
            pesquisa.setNomeUsuario(conex.rs.getString("nomeUsuario"));
            pesquisa.setNomeUsuario(conex.rs.getString("userName"));
            pesquisa.setNomeUsuario(conex.rs.getString("senha"));
            pesquisa.setNomeUsuario(conex.rs.getString("email"));
            pesquisa.setNomeUsuario(conex.rs.getString("categoria"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro"+ex);
        }
        
        conex.ExitConnection();
        return pesquisa;
    }
    
}
