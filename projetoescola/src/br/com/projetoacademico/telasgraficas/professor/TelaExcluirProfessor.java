/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.projetoacademico.telasgraficas.professor;

import br.com.projetoacademico.dao.DaoProfessor;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class TelaExcluirProfessor extends javax.swing.JInternalFrame {

    DaoProfessor dadosProfessor;

    /**
     * Creates new form TelaExcluirProfessor
     *
     * @param dadosProfessor
     */
    public TelaExcluirProfessor(DaoProfessor dadosProfessor) {
        this.dadosProfessor = dadosProfessor;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lblResultadoProf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRegistroSearch = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel5.setText("Professor: ");

        lblResultadoProf.setText("<O resultado aparecerá aqui>");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Exclusão de Professores");

        jLabel2.setText("Informe o registro do professor: ");

        btnVerificar.setText("Verificar REGISTRO");
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

        jLabel4.setText("<html> \t<p> \tPor questões de segurança é recomendavel realizar a verificação do registro do professor, <br> \tpara verificar se o professor ainda está cadastrado. \t</p>  </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegistroSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(57, 57, 57)
                                .addComponent(lblResultadoProf)))
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVerificar)
                                .addGap(64, 64, 64)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRegistroSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblResultadoProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerificar)
                    .addComponent(btnApagar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        if (txtRegistroSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de registro não preenchido");
        } else {
            int searchRegistro = Integer.parseInt(txtRegistroSearch.getText().toString());

            if (dadosProfessor.pesquisarProfessor(searchRegistro) == null) {
                JOptionPane.showMessageDialog(null, "Professor não encontrado na base de dados !");
            } else {
                lblResultadoProf.setText(dadosProfessor.pesquisarProfessor(searchRegistro).getName());
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed

        if (!txtRegistroSearch.getText().isEmpty()) {
            int registro = Integer.parseInt(txtRegistroSearch.getText());
            if (dadosProfessor.pesquisarProfessor(registro) != null) {
                int exclusao = JOptionPane.showConfirmDialog(null, "Deseja excluir o Professor : " + dadosProfessor.pesquisarProfessor(registro).getName(), "ATENÇÃO", JOptionPane.YES_NO_OPTION);
                if (exclusao == JOptionPane.YES_OPTION) {
                    dadosProfessor.excluirProfessor(registro);
                    JOptionPane.showMessageDialog(null, "Professor Excluído com sucesso");
                    lblResultadoProf.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Professor não excluído");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Impossivel excluir um Professor inexistente !");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Deve-se informar o registro do professor que será excluído.");
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
    private javax.swing.JLabel lblResultadoProf;
    private javax.swing.JTextField txtRegistroSearch;
    // End of variables declaration//GEN-END:variables
}
