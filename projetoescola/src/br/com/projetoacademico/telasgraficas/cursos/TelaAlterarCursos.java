/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.projetoacademico.telasgraficas.cursos;

import br.com.projetoacademico.dao.DaoProfessor;
import br.com.projetoacademico.projetoescola.Cursos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Danilo
 */
public class TelaAlterarCursos extends javax.swing.JInternalFrame {

    private final DaoProfessor updateCourseProfessor;
    private boolean permitionForUpdate;

    public TelaAlterarCursos(DaoProfessor updateCourseProfessor) {
        this.updateCourseProfessor = updateCourseProfessor;
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

        jLabel1 = new javax.swing.JLabel();
        comboCurso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCadDisciplinas = new javax.swing.JTextArea();
        btnAlterInformations = new javax.swing.JButton();
        btnSearchInformations = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistCourses = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Alterar cursos/disciplinas");

        comboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um curso", "ADS", "AGR ", "LOG ", " " }));

        jLabel12.setText("Curso:");

        jLabel13.setText("Disciplinas");

        txtCadDisciplinas.setColumns(20);
        txtCadDisciplinas.setRows(5);
        jScrollPane2.setViewportView(txtCadDisciplinas);

        btnAlterInformations.setText("Alterar Informações");
        btnAlterInformations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterInformationsActionPerformed(evt);
            }
        });

        btnSearchInformations.setText("Pesquisar Informações");
        btnSearchInformations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInformationsActionPerformed(evt);
            }
        });

        jLabel11.setText("<html>  <p>ATENÇÃO, No campo de disciplinas<br> \nInforme um abaixo do outro, todas as disciplinas que o professor terá. <br> \nCaso deseje cadastrar só o curso ou só as disciplinas, clique no botão<br>\ncorrespondente ao que deseja.\n</p> </html>");

        jLabel2.setText("<html>\n<p>\n\tClique em \"Pesquisar informações\", para trazer<br>\n\tos dados dos cursos e disciplinas do professor.<b>\n\t<b>\n</p>\n\n</html>");

        jLabel3.setText("Cursos e disciplinas ATUAIS do professor:");

        jScrollPane1.setViewportView(jlistCourses);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(btnSearchInformations, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlterInformations)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(146, 146, 146)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchInformations)
                    .addComponent(btnAlterInformations))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterInformationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterInformationsActionPerformed
        JOptionPane.showMessageDialog(null, """
                                            Pedimos desculpas pelo incoveniente, mas estamos com problemas no desenvolvimento. O erro ocorreu inesperadamente, 
                                            pe\u00e7o sua compreen\u00e7\u00e3o pois estamos tentando resolver o problema o mais rapido possivel !
                                            \n\nAtt, desenvolvedor Danilo de Araújo !""", "ATENÇÃO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAlterInformationsActionPerformed

    private void btnSearchInformationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInformationsActionPerformed
        searchInformation();
    }//GEN-LAST:event_btnSearchInformationsActionPerformed
    private void searchInformation(){
        String verifyRecordProf;
        int recordChecked;
        DefaultListModel listInformations = new DefaultListModel();
        
        verifyRecordProf = JOptionPane.showInputDialog(null,"Informe o registro do professor: ");
        if(verifyRecordProf != null){
            if(verifyRecordProf.matches("[0-9]+")){
                recordChecked = Integer.parseInt(verifyRecordProf.toString());
                if(updateCourseProfessor.pesquisarProfessor(recordChecked) != null){
                    for(Cursos courses : updateCourseProfessor.getCourses(recordChecked)){
                        listInformations.addElement("Curso: "+ courses.getNomeCurso() + "Disciplinas: " + courses.getDisciplinas());
                        jlistCourses.setModel(listInformations);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "O registro do professor não pode conter letras !");
            }
        }
    }
    

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterInformations;
    private javax.swing.JButton btnSearchInformations;
    private javax.swing.JComboBox<String> comboCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistCourses;
    private javax.swing.JTextArea txtCadDisciplinas;
    // End of variables declaration//GEN-END:variables
}
