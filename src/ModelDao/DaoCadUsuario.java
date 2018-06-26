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

    public void Cadastrar(BeansCadUsuario cadastro) {
        conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into Usuarios(matricula, nomeUser, senha, email, categoria) values (?,?,?,?,?)");
            pst.setString(1, cadastro.getMatricula());
            pst.setString(2, cadastro.getUsername());
            pst.setString(3, cadastro.getSenha());
            pst.setString(4, cadastro.getEmail());
            pst.setString(5, cadastro.getCategoria());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar !" + ex.getMessage());
        }
        conex.ExitConnection();
    }

    public BeansCadUsuario BuscaUsuario(BeansCadUsuario mod) {
        conex.Conection();
        conex.executaSQL("select * from Usuarios where matricula like'%" + mod.getPesquisa() + "%'");
        try {

            if (conex.rs.first()) {
                mod.setIdUsuario(conex.rs.getInt("idUsuario"));
                mod.setMatricula(conex.rs.getString("matricula"));
                mod.setUsername(conex.rs.getString("nomeUser"));
                mod.setSenha(conex.rs.getString("senha"));
                mod.setEmail(conex.rs.getString("email"));
                mod.setCategoria(conex.rs.getString("categoria"));
               
            }else{
                JOptionPane.showMessageDialog(null, "Nao Existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROOO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" + ex.getMessage());
        }

        conex.ExitConnection();
        return mod;
    }

    public void Editar(BeansCadUsuario editar) {

        conex.Conection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update Usuarios set matricula = ?, userName = ?, senha = ?, email = ?, categoria = ?");
            pst.setString(1, editar.getMatricula());
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
}
