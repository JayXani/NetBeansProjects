package telagraficaescola;

import dal.DalProfessor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetodaescola.Professor;

/**
 *
 * @author Danilo
 */
public class TelaCadastroProfessor extends javax.swing.JInternalFrame {

    private Professor professor;

    public TelaCadastroProfessor() {
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
        jLabel11 = new javax.swing.JLabel();
        checkEletiva = new javax.swing.JCheckBox();
        checkLP = new javax.swing.JCheckBox();
        checkPHP = new javax.swing.JCheckBox();
        checkSO = new javax.swing.JCheckBox();
        btnValidarMaterias = new javax.swing.JButton();

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

        jLabel10.setText("<html>\n\t<p>ATENÇÃO !<br><br>\n\tInforme as matérias lecionadas pelo professor\n\te em seguida,<br> clique em \"validar matérias\". <br>\n\tApós isso, clique em \"cadastrar\"\n\t\n\t</p>\n</hmtl>\n");

        jLabel11.setText("Materias disponiveis na instituição:");

        checkEletiva.setText("Eletiva - JAVA");

        checkLP.setText("Linguagem de Programação");
        checkLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLPActionPerformed(evt);
            }
        });

        checkPHP.setText("PHP");

        checkSO.setText("Sistemas Operacionais");

        btnValidarMaterias.setText("Validar Matérias");
        btnValidarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
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
                                        .addGap(52, 52, 52)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkLP)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(checkPHP)
                    .addComponent(checkEletiva)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnValidarMaterias)
                        .addComponent(checkSO)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(checkEletiva))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(checkLP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPHP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(checkSO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefoneProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarProfessor)
                    .addComponent(btnValidarMaterias))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProfessorActionPerformed

        DalProfessor novoProfessor = new DalProfessor(dadosProfessor());
        novoProfessor.cadastrarProfessor();

    }//GEN-LAST:event_btnCadastrarProfessorActionPerformed

    private void checkPort2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPort2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPort2ActionPerformed

    private void checkPort4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPort4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPort4ActionPerformed

    private void checkLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLPActionPerformed

    private void btnValidarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarMateriasActionPerformed

        disciplinasProfessor();

    }//GEN-LAST:event_btnValidarMateriasActionPerformed

    public ArrayList<String> disciplinasProfessor() {
        ArrayList<String> disciplinas = new ArrayList();

        if ((checkEletiva.isSelected() == false) && (checkLP.isSelected() == false) && (checkPHP.isSelected() == false)
                && (checkSO.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO !\n\nÉ necessario que o professor lecione pelo menos 1 materia !");
        } else {

            if (checkEletiva.isSelected()) {
                disciplinas.add(checkEletiva.getText());
            }

            if (checkLP.isSelected()) {
                disciplinas.add(checkLP.getText());
            }

            if (checkPHP.isSelected()) {
                disciplinas.add(checkPHP.getText());
            }

            if (checkSO.isSelected()) {
                disciplinas.add(checkSO.getText());
            }
        }
        return disciplinas;
    }

    public Professor dadosProfessor() {

        String sexo = comboSe.getSelectedItem().toString();

        if (txtRegistroProf.getText().isEmpty() || txtNomeProf.getText().isEmpty() || txtEndProf.getText().isEmpty()
                || txtTelefoneProf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos não preenchidos");

        } else {

            int registro = Integer.parseInt(txtRegistroProf.getText());
            professor = new Professor(registro, txtNomeProf.getText(),
                    txtEndProf.getText(), txtTelefoneProf.getText(), sexo, disciplinasProfessor());
            JOptionPane.showMessageDialog(null, "Professor Cadastrado com sucesso");
            txtRegistroProf.setText("");
            txtNomeProf.setText("");
            txtEndProf.setText("");
            txtTelefoneProf.setText("");
        }
        return professor;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProfessor;
    private javax.swing.JButton btnValidarMaterias;
    private javax.swing.JCheckBox checkEletiva;
    private javax.swing.JCheckBox checkLP;
    private javax.swing.JCheckBox checkPHP;
    private javax.swing.JCheckBox checkPort2;
    private javax.swing.JCheckBox checkPort4;
    private javax.swing.JCheckBox checkSO;
    private javax.swing.JComboBox<String> comboSe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEndProf;
    private javax.swing.JTextField txtNomeProf;
    private javax.swing.JTextField txtRegistroProf;
    private javax.swing.JTextField txtTelefoneProf;
    // End of variables declaration//GEN-END:variables
}
