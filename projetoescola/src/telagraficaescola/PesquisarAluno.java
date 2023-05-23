/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telagraficaescola;

import dao.DaoAluno;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import projetodaescola.Aluno;

/**
 *
 * @author Danilo
 */
public class PesquisarAluno extends javax.swing.JInternalFrame {

    DaoAluno aluno = new DaoAluno();
    DefaultListModel listaAlunos = new DefaultListModel();
    HashMap<Integer, Aluno> buscarAluno;

    /**
     * Creates new form PesquisarAluno
     *
     * @param aluno
     */
    public PesquisarAluno(DaoAluno aluno) {
        this.aluno = aluno;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAluno = new javax.swing.JList<>();
        btnSearchOneAluno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnFullAluno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRaSearch = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Pesquisar Aluno (s)");

        jScrollPane1.setViewportView(listaAluno);

        btnSearchOneAluno.setText("Pesquisar Aluno");
        btnSearchOneAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchOneAlunoActionPerformed(evt);
            }
        });

        jLabel2.setText("O resultado da busca aparecerá abaixo:");

        btnFullAluno.setText("Pesquisar TODOS os alunos");
        btnFullAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullAlunoActionPerformed(evt);
            }
        });

        jLabel3.setText("OU");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("<html> \t<p>Caso deseje escolher um ALUNO em especifico,<br>Informe o RA do aluno no campo abaixo,<br> \tem seguida clique em \"Pesquisar Aluno\". </p> </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSearchOneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(btnFullAluno)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchOneAluno)
                    .addComponent(jLabel3)
                    .addComponent(btnFullAluno))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchOneAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOneAlunoActionPerformed
        pesquisarOneAluno();
    }//GEN-LAST:event_btnSearchOneAlunoActionPerformed

    private void btnFullAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullAlunoActionPerformed
        pesquisarFullAlunos();
    }//GEN-LAST:event_btnFullAlunoActionPerformed
    private void pesquisarFullAlunos() {
        listaAluno.removeAll();
        buscarAluno = aluno.pesquisarFullAluno();
        if (buscarAluno == null) {
            JOptionPane.showMessageDialog(null, "Impossivel realizar a busca pois não existem alunos cadastrados");
        } else {
            for (int RaAluno : buscarAluno.keySet()) {
                listaAlunos.addElement("[ Aluno : " + aluno.pesquisarAluno(RaAluno).getName());
                listaAlunos.addElement("  RA: " + RaAluno + " ]");
                listaAluno.setModel(listaAlunos);
            }
        }
    }

    private void pesquisarOneAluno() {
        listaAluno.removeAll();
        if (txtRaSearch.getText().isEmpty() || txtRaSearch.getText().matches("[0-9]+") == false) {
            JOptionPane.showMessageDialog(null, "ERRO !\nCampo não preenchido corretamente");
        } else {
            int ra = Integer.parseInt(txtRaSearch.getText());
            if (aluno.pesquisarAluno(ra) == null) {
                JOptionPane.showMessageDialog(null, "Aluno não encontrado na base de dados !");
            } else {
                listaAlunos.addElement("[ Aluno : " + aluno.pesquisarAluno(ra).getName());
                listaAlunos.addElement("  RA: " + ra + " ]");
                listaAluno.setModel(listaAlunos);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFullAluno;
    private javax.swing.JButton btnSearchOneAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaAluno;
    private javax.swing.JTextField txtRaSearch;
    // End of variables declaration//GEN-END:variables
}
