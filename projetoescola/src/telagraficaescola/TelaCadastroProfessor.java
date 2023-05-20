package telagraficaescola;

import dao.DaoProfessor;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import projetodaescola.Cursos;
import projetodaescola.Professor;

/**
 *
 * @author Danilo
 */
public class TelaCadastroProfessor extends javax.swing.JInternalFrame {

    private final ArrayList<String> addDisciplinas = new ArrayList();
    private final ArrayList<Cursos> cursos = new ArrayList();
    private Cursos novoCurso;
    DaoProfessor novoProfessor = new DaoProfessor();
    private HashMap<Integer, Professor> buscarProfessor;

    public TelaCadastroProfessor(DaoProfessor novoProfessor) {
        this.novoProfessor = novoProfessor;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkPort2 = new javax.swing.JCheckBox();
        checkPort4 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefoneProf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRegistroProf = new javax.swing.JTextField();
        comboSe = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrarProfessor = new javax.swing.JButton();
        txtNomeProf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEndProf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboCurso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDisciplinas = new javax.swing.JTextField();

        checkPort2.setText("Português");
        checkPort2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPort2ActionPerformed(evt);
            }
        });

        checkPort4.setText("Português");
        checkPort4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPort4ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));

        jLabel6.setText("ex: Rua teste, 1");

        jLabel7.setText("Telefone");

        jLabel8.setText("ex: 119999-999");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Professor");

        jLabel2.setText("Registro do Professor:");

        jLabel9.setText("Sexo:");

        comboSe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Prefiro nao informar." }));

        jLabel3.setText("Nome completo do professor");

        btnCadastrarProfessor.setText("Cadastrar");
        btnCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProfessorActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço do professor:");

        jLabel5.setText(" (Apenas nome da rua e número)");

        jLabel10.setText("<html>\n\t<p>ATENÇÃO !<br><br>\n\tInforme as matérias lecionadas pelo professor\n\te em seguida,<br> clique em \"validar matérias\" toda vez que uma materia for colocada<br>no\n\tcampo de \"Disciplinas\". <br>\n\tApós isso, clique em \"cadastrar\"\n\t\n\t</p>\n</hmtl>\n");

        comboCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um curso", "ADS - Analise e Desenvolvimento de Sistemas", "AGR - Agro negócio", "LOG - Logística", " " }));
        comboCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCursoActionPerformed(evt);
            }
        });

        jLabel12.setText("Curso:");

        jLabel13.setText("Disciplinas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRegistroProf)
                    .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(comboSe, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTelefoneProf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndProf, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addGap(3, 3, 3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarProfessor)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProfessorActionPerformed
        dadosProfessor();
    }//GEN-LAST:event_btnCadastrarProfessorActionPerformed

    private void checkPort2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPort2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPort2ActionPerformed

    private void checkPort4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPort4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPort4ActionPerformed

    private void comboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCursoActionPerformed

    public void dadosProfessor() {

        String sexo = comboSe.getSelectedItem().toString();
        String nameCurso = comboCurso.getSelectedItem().toString();
        String disciplinas = txtDisciplinas.getText();
        ArrayList<String> addDiscipli = new ArrayList();
        

        if (txtRegistroProf.getText().isEmpty() || txtNomeProf.getText().isEmpty() || txtEndProf.getText().isEmpty()
                || txtTelefoneProf.getText().isEmpty() || nameCurso.equals("Escolha um curso") || disciplinas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO !\nCampos não preenchidos corretamente !");
        } else {
            int registro = Integer.parseInt(txtRegistroProf.getText());
            buscarProfessor = novoProfessor.pesquisarFULLprofessor();
            if (buscarProfessor != null && buscarProfessor.get(registro) != null) {
                JOptionPane.showMessageDialog(null, "ATENÇÃO !\nImpossivel fazer o cadastro de um novo professor com o registro informado !"
                        + "\nPois existe um professor com o mesmo registro.\n\n" + "Registro correspondente a: " + novoProfessor.pesquisarProfessor(registro).getName());
            } else {
                addDisciplinas.add(disciplinas);
                novoCurso = new Cursos(nameCurso, addDisciplinas);

                cursos.add(novoCurso);

                Professor professor = new Professor(registro, txtNomeProf.getText(),
                        txtEndProf.getText(), txtTelefoneProf.getText(), sexo, cursos);
                novoProfessor.cadastrarProfessor(professor);
                JOptionPane.showMessageDialog(null, "Professor Cadastrado com sucesso");

                txtRegistroProf.setText("");
                txtNomeProf.setText("");
                txtEndProf.setText("");
                txtTelefoneProf.setText("");
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProfessor;
    private javax.swing.JCheckBox checkPort2;
    private javax.swing.JCheckBox checkPort4;
    private javax.swing.JComboBox<String> comboCurso;
    private javax.swing.JComboBox<String> comboSe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDisciplinas;
    private javax.swing.JTextField txtEndProf;
    private javax.swing.JTextField txtNomeProf;
    private javax.swing.JTextField txtRegistroProf;
    private javax.swing.JTextField txtTelefoneProf;
    // End of variables declaration//GEN-END:variables
}
