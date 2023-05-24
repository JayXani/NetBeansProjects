/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.projetoacademico.telasgraficas;

import br.com.projetoacademico.dao.DaoProfessor;
import br.com.projetoacademico.projetoescola.Cursos;
import br.com.projetoacademico.projetoescola.Professor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class TelaAlterarProfessor extends javax.swing.JInternalFrame {

    private DaoProfessor professor;
    private int registro;
    private boolean permissaoAlterar;

    public TelaAlterarProfessor(DaoProfessor professor) {
        this.professor = professor;
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

        txtEndProfessor = new javax.swing.JTextField();
        btnProcurarProfessor = new javax.swing.JButton();
        txtNomeProfessor = new javax.swing.JTextField();
        btnAlterarDadosProf = new javax.swing.JButton();
        txtSexoDoProfessor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelProfessor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboCurso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDisciplinas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));

        btnProcurarProfessor.setText("Procurar Professor");
        btnProcurarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarProfessorActionPerformed(evt);
            }
        });

        btnAlterarDadosProf.setText("Alterar dados");
        btnAlterarDadosProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosProfActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel6.setText("ex: Rua teste, numero 10");

        jLabel4.setText("Telefone cadastrado:");

        jLabel5.setText("Endereço");

        jLabel7.setText("<html> <head>  <style> \tp{ \t\ttext-aling:justify; }  <style>  </head>   <p> Atenção !  <br><br> O Regsitro de um professor não pode ser alterado. <br>Clique no botão \"Procurar Professor\",<br> para trazer os dados do professor que deseja ! </p>    </html>");

        jLabel8.setText("Sexo:");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Alterar dados do professor");

        comboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um curso", "ADS - Analise e Desenvolvimento de Sistemas", "AGR - Agro negócio", "LOG - Logística", " " }));
        comboCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCursoActionPerformed(evt);
            }
        });

        jLabel12.setText("Curso:");

        jLabel13.setText("Disciplinas");

        jLabel3.setText("REGISTRO: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtTelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexoDoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8)
                            .addComponent(txtEndProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(127, 127, 127))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(227, 227, 227))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAlterarDadosProf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnProcurarProfessor))
                                    .addComponent(txtDisciplinas))
                                .addGap(15, 15, 15))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSexoDoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterarDadosProf)
                            .addComponent(btnProcurarProfessor))
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarProfessorActionPerformed

        pesquisarProfessor();
    }//GEN-LAST:event_btnProcurarProfessorActionPerformed

    private void btnAlterarDadosProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosProfActionPerformed
        if (permissaoAlterar == true) {
            alterarDados();
        } else {
            JOptionPane.showMessageDialog(null, "Você deve pesquisar o professor, antes da tentativa de alteração !");
        }
    }//GEN-LAST:event_btnAlterarDadosProfActionPerformed

    private void comboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCursoActionPerformed

    private void pesquisarProfessor() {
        Professor professorEncontrado;
        String verificadorRegistro = JOptionPane.showInputDialog(null, "Informe o REGISTRO do professor que deseja encontrar !", "Buscar Professor", JOptionPane.QUESTION_MESSAGE) ;
        if (!"".equals(verificadorRegistro)) {
            if (verificadorRegistro.matches("[0-9]+")) {
                registro = Integer.parseInt(verificadorRegistro.toString());
                if (professor.pesquisarProfessor(registro) != null) {
                    professorEncontrado = professor.pesquisarProfessor(registro);
                    txtNomeProfessor.setText(professorEncontrado.getName());
                    lblRegistro.setText(verificadorRegistro);
                    txtTelProfessor.setText(professorEncontrado.getTelefone());
                    txtEndProfessor.setText(professorEncontrado.getEndereco());
                    txtSexoDoProfessor.setText(professorEncontrado.getSexo());
                    permissaoAlterar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Professor não encontrado na base de dados");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O campo de REGISTRO do professor só é aceito números !");
            }
        }
      
    }

    private void alterarDados() {
        Professor antigoProfessor = professor.pesquisarProfessor(registro);
        Professor alteracaoProfessor;
        Cursos alterarCurso;
        ArrayList<Cursos> alteracaoCursos = new ArrayList();
        ArrayList<String> alterarDisciplinas = new ArrayList();
        String fullName = txtNomeProfessor.getText();
        String telProfessor = txtTelProfessor.getText();
        String enderecoProfessor = txtEndProfessor.getText();
        String sexo = txtSexoDoProfessor.getText();
        String disciplinas = txtDisciplinas.getText();
        String nomeCurso = comboCurso.getSelectedItem().toString();
        if (fullName.isEmpty() || telProfessor.isEmpty() || enderecoProfessor.isEmpty() || sexo.isEmpty()
                || nomeCurso.equals("Escolha um curso") || disciplinas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro !\n\nVerifique se há campos não preenchidos !");
        } else {
            alterarDisciplinas.add(disciplinas);
            alterarCurso = new Cursos(nomeCurso, alterarDisciplinas);
            alteracaoCursos.add(alterarCurso);
            if (txtTelProfessor.getText().matches("[0-9]+")) {
                alteracaoProfessor = new Professor(registro, fullName, enderecoProfessor, telProfessor, sexo, alteracaoCursos);
                professor.alterarProfessor(registro, antigoProfessor, alteracaoProfessor);
                JOptionPane.showMessageDialog(null, "Professor Alterado com sucesso !");
                txtNomeProfessor.setText("");
                lblRegistro.setText("");
                txtTelProfessor.setText("");
                txtSexoDoProfessor.setText("");
                txtEndProfessor.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Informe um número de telefone valido !");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDadosProf;
    private javax.swing.JButton btnProcurarProfessor;
    private javax.swing.JComboBox<String> comboCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtDisciplinas;
    private javax.swing.JTextField txtEndProfessor;
    private javax.swing.JTextField txtNomeProfessor;
    private javax.swing.JTextField txtSexoDoProfessor;
    private javax.swing.JTextField txtTelProfessor;
    // End of variables declaration//GEN-END:variables
}