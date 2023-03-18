package br.com.millivendas.telas;

import java.sql.*;
import br.com.millivendas.dal.Modulo_conector;
import javax.swing.JOptionPane;

public class TelaAdministrador extends javax.swing.JInternalFrame {

    private String emailUser;
    private String ConfirmeLogin;
    private String ConfirmSenha;
    private String Senha;

    public TelaAdministrador() {
        initComponents();
        conexao = Modulo_conector.conector();
    }

    Connection conexao = null;
    PreparedStatement PST = null;
    ResultSet RS = null;

    private void consulta() {

        String SQL = "select * from register_of_users where ID_user = ?";
        try {
            PST = conexao.prepareStatement(SQL);
            PST.setString(1, txtUserID.getText());
            RS = PST.executeQuery();
            if (RS.next()) {

                txtName.setText(RS.getString(2));
                txtTelefone.setText(RS.getString(3));
                txtEmail.setText(RS.getString(4));
                txtLogin.setText(RS.getString(5));
                cboPerfil.setSelectedItem(RS.getString(7));

            } else {
                txtName.setText(null);
                txtTelefone.setText(null);
                txtEmail.setText(null);
                txtLogin.setText(null);
                JOptionPane.showMessageDialog(null, "Usuário com o ID: " + txtUserID.getText() + "\n NÃO encontrado no banco !");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void cadastroUsuarios() {

        String SQL = "insert into register_of_users (ID_user, name_user, phone_number, email_user, login_user, password_user, profile_user) values (?,?,?,?,?,?,?)";
        emailUser = txtEmail.getText();
        ConfirmeLogin = txtLogin.getText();
        Senha = txtPassword.getText();
        ConfirmSenha = new String(txtConfirmePass.getPassword());
        String tellCompleto = cboDD.getSelectedItem().toString() + txtTelefone.getText();
        int adicionado;
        try {
            PST = conexao.prepareStatement(SQL);
            PST.setString(1, txtUserID.getText());
            PST.setString(2, txtName.getText());
            PST.setString(3, tellCompleto);

            if (cboDD.getSelectedItem().equals("DD")) {
                JOptionPane.showMessageDialog(null, "Informe um DD válido");
            } else {
                if (emailUser.equals(ConfirmeLogin)) {
                    if (Senha.equals(ConfirmSenha)) {

                        PST.setString(4, emailUser);
                        PST.setString(5, ConfirmeLogin);
                        PST.setString(6, ConfirmSenha);
                        PST.setString(7, cboPerfil.getSelectedItem().toString());
                        if (txtUserID.getText().isEmpty() || txtName.getText().isEmpty() || cboDD.getSelectedItem().equals("DD")
                                || txtTelefone.getText().isEmpty() || txtEmail.getText().isEmpty() || txtLogin.getText().isEmpty()
                                || txtPassword.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(null, "Verifique as informações preenchidas \n Existem campos sem preenchimento !");
                        } else {
                            
                            
                            adicionado = PST.executeUpdate();

                            // 1 true and 0 false
                            if (adicionado > 0) {
                                JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso !");
                                txtName.setText(null);
                                txtTelefone.setText(null);
                                txtEmail.setText(null);
                                txtLogin.setText(null);
                                txtUserID.setText(null);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Senhas invalidas !");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Emails Invalidos");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void updateTable() {
        String SQL = "update register_of_users set name_user = ?,phone_number=?,email_user=?,login_user=?,password_user=?,profile_user=? where ID_user =?";
        emailUser = txtEmail.getText();
        ConfirmeLogin = txtLogin.getText();
        Senha = txtPassword.getText();
        ConfirmSenha = new String(txtConfirmePass.getPassword());
        String tellCompleto = cboDD.getSelectedItem().toString() + txtTelefone.getText();
        int adicionado;
        
        try {
            
            PST = conexao.prepareStatement(SQL);
            PST.setString(1, txtName.getText());
            PST.setString(2, tellCompleto);
            PST.setString(3, emailUser);
            PST.setString(4, ConfirmeLogin);
            PST.setString(5, ConfirmSenha);
            PST.setString(6, cboPerfil.getSelectedItem().toString());
            PST.setString(7,txtUserID.getText());

            if (cboDD.getSelectedItem().equals("DD")) {
                JOptionPane.showMessageDialog(null, "Informe um DD válido !");
            } else {
                if (emailUser.equals(ConfirmeLogin)) {
                    if (Senha.equals(ConfirmSenha)) {

                        if (txtUserID.getText().isEmpty() || txtName.getText().isEmpty() || txtTelefone.getText().isEmpty()
                                || txtEmail.getText().isEmpty() || txtLogin.getText().isEmpty()
                                || txtPassword.getText().isEmpty()) {

                            JOptionPane.showMessageDialog(null, "Verifique as informações preenchidas \n Existem campos sem preenchimento !");
                        } else {
                            
                            adicionado = PST.executeUpdate();

                            // 1 true and 0 false
                            if (adicionado > 0) {
                                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!");
                                txtName.setText(null);
                                txtTelefone.setText(null);
                                txtEmail.setText(null);
                                txtLogin.setText(null);
                                txtUserID.setText(null);
                                txtPassword.setText(null);
                                txtConfirmePass.setText(null);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Senhas invalidas !");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Emails Invalidos");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    private void deleteUsers(){
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir este usuário ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                String SQL =  "delete from register_of_users where ID_user = ?";
                
                PST = conexao.prepareStatement(SQL);
                PST.setString(1,txtUserID.getText());
                int apagado =PST.executeUpdate();
                
                if(apagado > 0){
                txtName.setText(null);
                txtTelefone.setText(null);
                txtEmail.setText(null);
                txtLogin.setText(null);
                txtUserID.setText(null);
                txtPassword.setText(null);
                txtConfirmePass.setText(null);
                }
                
                
                
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField5 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtConfirmePass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboPerfil = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCad = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboDD = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administração");
        setPreferredSize(new java.awt.Dimension(555, 0));

        jLabel1.setText("Pesquisar novos usuários: ");

        jLabel2.setText("ID");

        jLabel3.setText("Nome:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Email:");

        jLabel6.setText("Login: ");

        jLabel7.setText("Defina uma senha de login:");

        jLabel8.setText("Confirme a senha:");

        jLabel9.setText("Defina o tipo de acesso:");

        cboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADM", "Funcionário" }));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/millivendas/imagens/Buscar.png"))); // NOI18N
        btnConsultar.setToolTipText("Buscar usuário");
        btnConsultar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnConsultarMouseMoved(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/millivendas/imagens/Atualizar.png"))); // NOI18N
        btnUpdate.setToolTipText("Atualizar informações de usuário");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/millivendas/imagens/Inserir.png"))); // NOI18N
        btnCad.setToolTipText("Cadastrar Usuário");
        btnCad.setPreferredSize(new java.awt.Dimension(136, 28));
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/millivendas/imagens/Excluir (1).png"))); // NOI18N
        btnDelete.setToolTipText("Excluir usuário");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Seu login deve ser igual ao seu email");

        cboDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "(+55)" }));

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("ex: 119888-7777");

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Todos os campos são obrigatórios preencher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConfirmePass)
                                    .addComponent(txtPassword)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnUpdate)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8)
                                                .addComponent(cboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(250, 250, 250)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel6)
                                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cboDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 64, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnConsultar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnConsultar)
                        .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setBounds(0, 0, 620, 527);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        consulta();

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        deleteUsers();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        // TODO add your handling code here:

        cadastroUsuarios();

    }//GEN-LAST:event_btnCadActionPerformed

    private void btnConsultarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarMouseMoved

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateTable();

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboDD;
    private javax.swing.JComboBox<String> cboPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPasswordField txtConfirmePass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
