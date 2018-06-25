package ModelDao;

import ModelBeans.BeansCadUsuario;
import ModelConnection.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
