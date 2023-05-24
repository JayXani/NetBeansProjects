/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.projetoacademico.telasgraficas;

import br.com.projetoacademico.dao.DaoAluno;
import javax.swing.JOptionPane;
import br.com.projetoacademico.projetoescola.Aluno;

public class TelaAlterarAluno extends javax.swing.JInternalFrame {

    private DaoAluno aluno;
    private int ra;
    private boolean permissaoAlterar;

    public TelaAlterarAluno(DaoAluno aluno) {
        this.aluno = aluno;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnProcurarAluno = new javax.swing.JButton();
        btnAlterarDados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblRaAluno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelAluno = new javax.swing.JTextField();
        txtEndAluno = new javax.swing.JTextField();
        txtNomeAluno = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Alterar dados do aluno");

        btnProcurarAluno.setText("Procurar Aluno");
        btnProcurarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarAlunoActionPerformed(evt);
            }
        });

        btnAlterarDados.setText("Alterar dados");
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("RA: ");

        jLabel4.setText("Telefone cadastrado:");

        jLabel5.setText("Endereço cadastrado");

        jLabel7.setText("<html> <head>  <style> \tp{ \t\ttext-aling:justify; }  <style>  </head>   <p> Atenção !  <br><br> O Ra de um aluno não pode ser alterado. Clique no botão \"Procurar Aluno\",<br> para trazer os dados do aluno que deseja ! </p>    </html>");

        jLabel8.setText("Sexo:");

        jLabel6.setText("ex: Rua teste, numero 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(lblRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(btnProcurarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(178, 178, 178)
                            .addComponent(btnAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jLabel8)
                            .addGap(117, 117, 117)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(31, 31, 31))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addComponent(txtEndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtTelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtEndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcurarAluno)
                    .addComponent(btnAlterarDados))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarAlunoActionPerformed

        pesquisarAluno();
    }//GEN-LAST:event_btnProcurarAlunoActionPerformed

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed
        if (permissaoAlterar == true) {
            alterarDados();
        }else{
            JOptionPane.showMessageDialog(null,"Você deve pesquisar o aluno, antes da tentativa de alteração !");
        }
    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private boolean pesquisarAluno() {
        Aluno alunoEncontrado;
        String verificadorRa = JOptionPane.showInputDialog(null, "Informe o RA do aluno que deseja encontrar !", "Buscar aluno", JOptionPane.QUESTION_MESSAGE);
        if (verificadorRa.matches("[0-9]+")) {
            ra = Integer.parseInt(verificadorRa.toString());
            if (aluno.pesquisarAluno(ra) != null) {
                alunoEncontrado = aluno.pesquisarAluno(ra);
                txtNomeAluno.setText(alunoEncontrado.getName());
                lblRaAluno.setText(verificadorRa);
                txtTelAluno.setText(alunoEncontrado.getTelefone());
                txtEndAluno.setText(alunoEncontrado.getEndereco());
                txtSexo.setText(alunoEncontrado.getSexo());
                permissaoAlterar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Aluno não encontrado na base de dados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de RA do aluno só é aceito números !");
        }
        return true;
    }

    private void alterarDados() {
        Aluno antigoALuno = aluno.pesquisarAluno(ra);
        Aluno alteracaoAluno;
        String fullName = txtNomeAluno.getText();
        String telAluno = txtTelAluno.getText();
        String enderecoAluno = txtEndAluno.getText();
        String sexo = txtSexo.getText();
        if (fullName.isEmpty() || telAluno.isEmpty() || enderecoAluno.isEmpty() || sexo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro !\n\nVerifique se há campos não preenchidos !");
        } else {
            if (txtTelAluno.getText().matches("[0-9]+")) {
                alteracaoAluno = new Aluno(ra, fullName, enderecoAluno, telAluno, sexo);
                aluno.alterarAluno(ra, antigoALuno, alteracaoAluno);
                JOptionPane.showMessageDialog(null, "Aluno Alterado com sucesso !");
                txtNomeAluno.setText("");
                lblRaAluno.setText("");
                txtTelAluno.setText("");
                txtSexo.setText("");
                txtEndAluno.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Informe um número de telefone valido !");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnProcurarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblRaAluno;
    private javax.swing.JTextField txtEndAluno;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelAluno;
    // End of variables declaration//GEN-END:variables
}
