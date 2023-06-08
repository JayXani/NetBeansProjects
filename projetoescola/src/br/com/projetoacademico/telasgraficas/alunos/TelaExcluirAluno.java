package br.com.projetoacademico.telasgraficas.alunos;

import br.com.projetoacademico.dao.DaoAluno;
import javax.swing.JOptionPane;

public class TelaExcluirAluno extends javax.swing.JInternalFrame {

    DaoAluno dadosAluno = new DaoAluno();

    public TelaExcluirAluno(DaoAluno dadosAluno) {
        this.dadosAluno = dadosAluno;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRaSearch = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Exclusão");
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Exclusão de alunos");

        jLabel2.setText("Informe o RA do aluno: ");

        btnVerificar.setText("Verificar RA");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("ATENÇÃO:");

        jLabel4.setText("<html> \t<p> \tPor questões de segurança é recomendavel realizar a verificação do RA, <br> \tpara verificar se o aluno  ainda está cadastrado. \t</p>  </html>");

        jLabel5.setText("Aluno:");

        lblResultado.setText("<O resultado aparecerá aqui>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnVerificar)
                                .addGap(50, 50, 50)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(339, 339, 339))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResultado)
                                    .addComponent(txtRaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerificar)
                    .addComponent(btnApagar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        if (txtRaSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de RA não preenchido");
        } else {
            int searchRa = Integer.parseInt(txtRaSearch.getText().toString());

            if (dadosAluno.pesquisarAluno(searchRa) == null) {
                JOptionPane.showMessageDialog(null, "Aluno não encontrado na base de dados !");
            } else {
                lblResultado.setText(dadosAluno.pesquisarAluno(searchRa).getName());
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        int ra;
        String verificadorRa = txtRaSearch.getText();
        if (verificadorRa.matches("[0-9]+") && !txtRaSearch.getText().isEmpty()) {
            ra = Integer.parseInt(verificadorRa.toString());
            if (dadosAluno.pesquisarAluno(ra) != null) {
                int exclusao = JOptionPane.showConfirmDialog(null, "Deseja excluir o aluno : " + dadosAluno.pesquisarAluno(ra).getName(), "ATENÇÃO", JOptionPane.YES_NO_OPTION);
                if (exclusao == JOptionPane.YES_OPTION) {
                    dadosAluno.excluirAluno(ra);
                    JOptionPane.showMessageDialog(null, "Aluno Excluído com sucesso");
                    lblResultado.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Aluno não excluído");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Impossivel excluir um aluno inexistente !");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Informe um valor númerico !");
        }

    }//GEN-LAST:event_btnApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtRaSearch;
    // End of variables declaration//GEN-END:variables
}
