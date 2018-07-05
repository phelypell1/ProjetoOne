/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

import ModelBeans.BeansCadUsuario;
import ModelConnection.ConexaoDB;
import ModelDao.DaoCadUsuario;
import ModelTable.ModelTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author phelype
 */
public class ViewCadUsuarios extends javax.swing.JFrame {

    BeansCadUsuario cadUser = new BeansCadUsuario();
    DaoCadUsuario DaoUser = new DaoCadUsuario();
    ConexaoDB conex = new ConexaoDB();
    int flag = 0;

    /**
     * Creates new form ViewCadUsuarios
     */
    public ViewCadUsuarios() {
        initComponents();
        insereTable("select * from Usuarios order by nomeUser");
        preencheJCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jcomboCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        buttonNovoCadastro = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Id");

        jTextField1.setEnabled(false);

        jLabel2.setText("Matricula");

        textMatricula.setEnabled(false);

        jLabel3.setText("Nome Usuario");

        textUserName.setEnabled(false);

        jLabel4.setText("Senha");

        textSenha.setEnabled(false);

        jLabel5.setText("Categoria");

        jcomboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Suporte", "Gerente", "Recepçao", "tecnico" }));
        jcomboCategoria.setEnabled(false);

        jLabel6.setText("E-mail");

        textEmail.setEnabled(false);

        buttonNovoCadastro.setText("Novo Cadastro");
        buttonNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoCadastroActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.setEnabled(false);
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.setEnabled(false);
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir");
        buttonExcluir.setEnabled(false);
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.setEnabled(false);
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Buscar Matricula");

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(buttonBuscar)
                                            .addGap(59, 59, 59))
                                        .addComponent(textEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addComponent(buttonNovoCadastro))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jcomboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(buttonSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonExcluir)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCancelar)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNovoCadastro)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonEditar)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBuscar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(941, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Campo responsavel por preencher o jcombox//
    public void preencheJCombo(){
        conex.Conection();
        
        conex.executaSQL("select * from CategoriaUser order by descTipo");
        try {
            conex.rs.first();
            jcomboCategoria.removeAllItems();
            do{
                jcomboCategoria.addItem(conex.rs.getString("descTipo"));
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" +ex);
        }
        
        conex.CloseConnection();
    }
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (flag == 1) {
            if (textMatricula.getText().equalsIgnoreCase("") || textUserName.getText().equalsIgnoreCase("")
                    || textSenha.getText().equalsIgnoreCase("") || textEmail.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Para salvar os dados preencha os campos.");
            } else {

                cadUser.setMatricula(textMatricula.getText());
                cadUser.setUsername(textUserName.getText());
                cadUser.setSenha(textSenha.getText());
                cadUser.setEmail(textEmail.getText());
                cadUser.setCategoria((String) jcomboCategoria.getSelectedItem());
                DaoUser.Cadastrar(cadUser);

                textMatricula.setText("");
                textUserName.setText("");
                textSenha.setText("");
                textEmail.setText("");
                jcomboCategoria.setSelectedItem("");
                insereTable("select * from Usuarios order by nomeUser");

            }
        } else {
            cadUser.setMatricula(textMatricula.getText());
            cadUser.setUsername(textUserName.getText());
            cadUser.setSenha(textSenha.getText());
            cadUser.setEmail(textEmail.getText());
            cadUser.setCategoria((String) jcomboCategoria.getSelectedItem());
            DaoUser.Editar(cadUser);

            textMatricula.setText("");
            textUserName.setText("");
            textSenha.setText("");
            textEmail.setText("");
            jcomboCategoria.setSelectedItem("");
            textBuscar.setText("");

            textMatricula.setEnabled(false);
            textUserName.setEnabled(false);
            textSenha.setEnabled(false);
            textEmail.setEnabled(false);
            jcomboCategoria.setEnabled(false);
            buttonSalvar.setEnabled(false);
            buttonCancelar.setEnabled(false);
            buttonNovoCadastro.setEnabled(true);
            insereTable("select * from Usuarios order by nomeUser");
        }


    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonNovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoCadastroActionPerformed
        flag = 1;
        textMatricula.setEnabled(true);
        textUserName.setEnabled(true);
        textSenha.setEnabled(true);
        textEmail.setEnabled(true);
        jcomboCategoria.setEnabled(true);
        buttonSalvar.setEnabled(true);
        buttonCancelar.setEnabled(true);
        buttonNovoCadastro.setEnabled(false);
        textBuscar.setEnabled(false);
        buttonBuscar.setEnabled(false);
    }//GEN-LAST:event_buttonNovoCadastroActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        textMatricula.setEnabled(false);
        textUserName.setEnabled(false);
        textSenha.setEnabled(false);
        textEmail.setEnabled(false);
        jcomboCategoria.setEnabled(false);
        buttonSalvar.setEnabled(false);
        buttonCancelar.setEnabled(false);
        buttonNovoCadastro.setEnabled(true);
        buttonBuscar.setEnabled(true);
        textBuscar.setEnabled(true);

        textMatricula.setText("");
        textUserName.setText("");
        textSenha.setText("");
        textEmail.setText("");
        jcomboCategoria.setSelectedItem("");
        textBuscar.setText("");
        jTextField1.setText("");


    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        flag = 2;

        textMatricula.setEnabled(true);
        textUserName.setEnabled(true);
        textSenha.setEnabled(true);
        textEmail.setEnabled(true);
        jcomboCategoria.setEnabled(true);
        buttonSalvar.setEnabled(true);
        buttonCancelar.setEnabled(true);
        buttonNovoCadastro.setEnabled(false);
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        if (textBuscar.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Campo em branco !"
                    + "\n Digite algo para pesquisar.");
        } else {
            cadUser.setPesquisa(textBuscar.getText());
            BeansCadUsuario model = DaoUser.BuscaUsuario(cadUser);
            /*Campo para preencher os dados, nao utilizado*/
            /*jTextField1.setText(String.valueOf(model.getIdUsuario()));
            textMatricula.setText(model.getMatricula());
            textUserName.setText(model.getUsername());
            textSenha.setText(model.getSenha());
            textEmail.setText(model.getEmail());
            jcomboCategoria.setSelectedItem(model.getCategoria());*/
            
            //preenche a tabela com os campos da pesquisa//
            insereTable("select * from Usuarios where matricula like'%" + cadUser.getPesquisa() + "%'");
            textMatricula.setText("");
            textUserName.setText("");
            textSenha.setText("");
            textEmail.setText("");
            jcomboCategoria.setSelectedItem("");
            textBuscar.setText("");
            jTextField1.setText("");

            buttonCancelar.setEnabled(true);
            buttonEditar.setEnabled(true);
            buttonExcluir.setEnabled(true);
        }

    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        int opcao = 0;
        opcao = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir usuario ? ");

        if (opcao == JOptionPane.YES_OPTION) {
            cadUser.setIdUsuario(Integer.parseInt(jTextField1.getText()));
            DaoUser.Excluir(cadUser);

            textMatricula.setText("");
            textUserName.setText("");
            textSenha.setText("");
            textEmail.setText("");
            jcomboCategoria.setSelectedItem("");
            textBuscar.setText("");
            jTextField1.setText("");
            insereTable("select * from Usuarios order by nomeUser");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cancelado !!!");
        }

    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String nome = "" + jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        conex.Conection();
        conex.executaSQL("select * from Usuarios where matricula ='" + nome + "'");
        try {
            conex.rs.first();
            jTextField1.setText(String.valueOf(conex.rs.getInt("idUsuario")));
            textMatricula.setText(conex.rs.getString("matricula"));
            textUserName.setText(conex.rs.getString("nomeUser"));
            textSenha.setText(conex.rs.getString("senha"));
            textEmail.setText(conex.rs.getString("email"));
            jcomboCategoria.setSelectedItem(conex.rs.getString("categoria"));
        } catch (SQLException ex) {
            Logger.getLogger(ViewCadUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.CloseConnection();

    }//GEN-LAST:event_jTable1MouseClicked

    public void insereTable(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"id", "Matricula", "Nome", "Senha", "email", "Categoria"};
        conex.Conection();
        conex.executaSQL(sql);
        try {
            conex.rs.first();

            do {
                dados.add(new Object[]{conex.rs.getInt("idUsuario"), conex.rs.getString("matricula"), conex.rs.getString("nomeUser"), conex.rs.getString("senha"), conex.rs.getString("email"), conex.rs.getString("categoria")});

            } while (conex.rs.next());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ! Digite a matricula do usuario");
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);
        jTable1.setModel(modelo);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(0).setResizable(true);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setResizable(true);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(2).setResizable(true);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setResizable(true);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(205);
        jTable1.getColumnModel().getColumn(4).setResizable(true);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(220);
        jTable1.getColumnModel().getColumn(5).setResizable(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conex.CloseConnection();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovoCadastro;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcomboCategoria;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
