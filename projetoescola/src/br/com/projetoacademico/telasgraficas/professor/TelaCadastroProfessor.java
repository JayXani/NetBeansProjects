package br.com.projetoacademico.telasgraficas.professor;

import br.com.projetoacademico.dao.DaoProfessor;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import br.com.projetoacademico.projetoescola.Professor;


/**
 *
 * @author Danilo
 */
public class TelaCadastroProfessor extends javax.swing.JInternalFrame {
    
    private final ArrayList<String> addDisciplinas = new ArrayList();
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
        jLabel11 = new javax.swing.JLabel();

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
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));

        jLabel6.setText("ex: Rua teste, 1");

        jLabel7.setText("Telefone");

        jLabel8.setText("ex: 119999-999");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Professor");

        jLabel2.setText("Registro do Professor:");

        jLabel9.setText("Sexo:");

        comboSe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Prefiro não informar." }));

        jLabel3.setText("Nome completo do professor");

        btnCadastrarProfessor.setText("Cadastrar");
        btnCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProfessorActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço do professor:");

        jLabel5.setText(" (Apenas nome da rua e número)");

        txtEndProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndProfActionPerformed(evt);
            }
        });

        jLabel11.setText("<html>  <p>ATENÇÃO, Não é necessario informar as disciplinas<br> nem o curso do professor. No menu principal, <br>você terá a opção<br> de cadastrar as disciplinas e cursos do professor.\"</p> </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndProf, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(comboSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRegistroProf)
                                        .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8))
                                        .addComponent(txtTelefoneProf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addGap(3, 3, 3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistroProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(txtEndProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefoneProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarProfessor)
                .addGap(17, 17, 17))
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

    private void txtEndProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndProfActionPerformed

    public void dadosProfessor() {
        
        String sexo = comboSe.getSelectedItem().toString();
        String validadorRegistro = txtRegistroProf.getText();
        String nomeProfessor = txtNomeProf.getText();
        String enderecoProfe = txtEndProf.getText();
        String telefoneProfe = txtTelefoneProf.getText();
        
        

        if (validadorRegistro.isEmpty() || nomeProfessor.isEmpty() || enderecoProfe.isEmpty()
                || telefoneProfe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO !\nCampos não preenchidos corretamente !");
        } else {
            int registro = Integer.parseInt(validadorRegistro);
            buscarProfessor = novoProfessor.pesquisarFULLprofessor();
            if (buscarProfessor != null && buscarProfessor.get(registro) != null) {
                JOptionPane.showMessageDialog(null, """
                                                    ATEN\u00c7\u00c3O !
                                                    Impossivel fazer o cadastro de um novo professor com o registro informado !
                                                    Pois existe um professor com o mesmo registro.
                                                    
                                                    Registro correspondente a: """ + novoProfessor.pesquisarProfessor(registro).getName());
            } else {
                
                Professor professor = new Professor(registro, txtNomeProf.getText(),
                        txtEndProf.getText(), txtTelefoneProf.getText(), sexo);
                novoProfessor.cadastrarProfessor(professor);
                JOptionPane.showMessageDialog(null, "Professor Cadastrado com sucesso");
                txtRegistroProf.setText("");
                txtNomeProf.setText("");
                txtEndProf.setText("");
                txtTelefoneProf.setText("");
                this.dispose();
     
            }

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProfessor;
    private javax.swing.JCheckBox checkPort2;
    private javax.swing.JCheckBox checkPort4;
    private javax.swing.JComboBox<String> comboSe;
    private javax.swing.JLabel jLabel1;
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
