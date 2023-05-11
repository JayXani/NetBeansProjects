/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.telashoteis.projetohoteis;

import br.com.classeshoteis.Camas;
import br.com.classeshoteis.ReservaQuarto;
import br.com.clientes.Clientes;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class TelaEscolhaQuarto extends javax.swing.JInternalFrame {

    private ArrayList<Clientes> hospedeNovo;
    private ReservaQuarto informacoesQuarto;
    private double precoDiaria = 350.00;
    LocalDate checkIn;
    LocalDate checkOut;

    public TelaEscolhaQuarto() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        btnConfirmaReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quantidadeCamas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboCasal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboSolteiro = new javax.swing.JComboBox<>();
        comboKing = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboQueen = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboFrigobar = new javax.swing.JComboBox<>();
        comboSacada = new javax.swing.JComboBox<>();
        comboTV = new javax.swing.JComboBox<>();
        comboBanheiro = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblPrecoSacada = new javax.swing.JLabel();
        lblPrecoTV = new javax.swing.JLabel();
        lblPrecoFrigo = new javax.swing.JLabel();
        lblPrecoBanheiro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dayCheckin = new javax.swing.JComboBox<>();
        yearCheckin = new javax.swing.JComboBox<>();
        monthCheckin = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dayCheckOut = new javax.swing.JComboBox<>();
        yearCheckOut = new javax.swing.JComboBox<>();
        monthCheckOut = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel9.setText("King");

        jCheckBox10.setText("Não");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(675, 564));
        setMinimumSize(new java.awt.Dimension(675, 564));
        setPreferredSize(new java.awt.Dimension(675, 564));

        btnConfirmaReserva.setText("Confirmar Reserva");
        btnConfirmaReserva.setBorderPainted(false);
        btnConfirmaReserva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnConfirmaReservaStateChanged(evt);
            }
        });
        btnConfirmaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaReservaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel1.setText("Escolha do Quarto");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Os campos que possuem ( * ) são obrigatórios");

        jLabel5.setText("As opções abaixo são de escolha única, selecione o que deseja ter no quarto.");

        quantidadeCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", " " }));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("<html>\n\n*Quantidade de camas<br>\ne tipo:\n\n</html>");

        comboCasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboCasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCasalActionPerformed(evt);
            }
        });

        jLabel4.setText("Casal");

        jLabel7.setText("Solteiro");

        comboSolteiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboSolteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSolteiroActionPerformed(evt);
            }
        });

        comboKing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboKing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKingActionPerformed(evt);
            }
        });

        jLabel8.setText("King");

        comboQueen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboQueen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQueenActionPerformed(evt);
            }
        });

        jLabel10.setText("Queen");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("<html> * Marque aquilo que deseja no quarto:\n </html> ");

        jLabel11.setText("Frigobar ?");

        jLabel12.setText("Sacada ?");

        jLabel13.setText("TV ?");

        jLabel14.setText("Banheiro Privativo ?");

        comboFrigobar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        comboSacada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        comboTV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        comboBanheiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel19.setText("R$ 350,00");

        jLabel20.setText("Preço diaria: ");

        lblPrecoSacada.setText("R$ 50,00 a mais.");

        lblPrecoTV.setText("R$ 35,00 a mais.");

        lblPrecoFrigo.setText("R$ 150,00 a mais.");

        lblPrecoBanheiro.setText("R$ 60,00 a mais.");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel15.setText("*Informe a data de checkIN:");

        dayCheckin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearCheckin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANO", "2023" }));

        monthCheckin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÊS", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " ", " " }));

        jLabel16.setText("<data>");

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel17.setText("*Informe a data de checkOUT:");

        dayCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANO", "2023" }));

        monthCheckOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÊS", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jLabel18.setText("<data>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(comboBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboFrigobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboSacada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboSolteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(comboCasal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboKing, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(comboQueen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrecoSacada)
                                        .addGap(132, 132, 132))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrecoFrigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dayCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(monthCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecoTV)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dayCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(yearCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPrecoBanheiro))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnConfirmaReserva)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboCasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboKing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboSolteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboQueen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboFrigobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoFrigo)
                    .addComponent(dayCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(comboSacada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoSacada))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoTV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(comboBanheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoBanheiro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72)
                .addComponent(btnConfirmaReserva)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaReservaActionPerformed
        setDiaria();
        int confirmacao = JOptionPane.showConfirmDialog(null, "ATENÇÃO !\n\nO valor da diaria ficou em:\n "
                + "R$ " + precoDiaria + "\n\nDeseja Processeguir com a reserva ?", "Verificação", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Reserva não concluída (CANCELADA)");
            precoDiaria = 350.00;
        } else {
            dadosQuarto();
        }

    }//GEN-LAST:event_btnConfirmaReservaActionPerformed

    private void validarReserva(){
        
    }
    
    private ReservaQuarto dadosQuarto() {

        //Type of Bed
        int quantCamas = Integer.parseInt(quantidadeCamas.getSelectedItem().toString());
        int camaSolteiro = Integer.parseInt(comboSolteiro.getSelectedItem().toString());
        int camaCasal = Integer.parseInt(comboCasal.getSelectedItem().toString());
        int camaKing = Integer.parseInt(comboKing.getSelectedItem().toString());
        int camaQueen = Integer.parseInt(comboQueen.getSelectedItem().toString());
        int validacaoCamas = camaSolteiro + camaCasal + camaKing + camaQueen;

        //Escolha de "componentes" para o quarto
        boolean frigobar;
        boolean tv;
        boolean sacada;
        boolean banheiroPrivativo;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        ArrayList<Camas> camasSelecionadas = new ArrayList();

        //CheckIN
        int dayCheckIN;
        int monthCheckIN;
        int yearCheckIN;

        //CheckOUT
        int dayCheckout;
        int monthCheckout;
        int yearCheckout;

        if (validacaoCamas != quantCamas) {
            JOptionPane.showMessageDialog(null, "ATEÇÃO !\nA quantidade dos tipos escolhidos de camas"
                    + " não corresponde com a quantidade selecionada !");
        } else {
            for (int i = 0; i < quantCamas; i++) {
                if (camaSolteiro > 0) {
                    camasSelecionadas.add(new Camas("Cama Solteiro", i));
                    camaSolteiro--;
                }
                if (camaCasal > 0) {
                    camasSelecionadas.add(new Camas("Cama Casal", i));
                    camaCasal--;
                }
                if (camaKing > 0) {
                    camasSelecionadas.add(new Camas("Cama King", i));
                    camaKing--;
                }
                if (camaQueen > 0) {
                    camasSelecionadas.add(new Camas("Cama Queen", i));
                    camaQueen--;
                }
            }

            frigobar = (comboFrigobar.getSelectedItem().toString().equals("Sim"));
            tv = (comboTV.getSelectedItem().toString().equals("Sim"));
            sacada = (comboSacada.getSelectedItem().toString().equals("Sim"));
            banheiroPrivativo = (comboBanheiro.getSelectedItem().toString().equals("Sim"));

            if ((dayCheckin.getSelectedItem().equals("DIA")) || (monthCheckin.getSelectedItem().equals("MÊS")) || (yearCheckin.getSelectedItem().equals("ANO"))) {
                JOptionPane.showMessageDialog(null, "ATENÇÃO !\n\nÉ necessário informar a data de checkIN");
            } else {

                if ((dayCheckOut.getSelectedItem().equals("DIA")) || (monthCheckOut.getSelectedItem().equals("MÊS")) || (yearCheckOut.getSelectedItem().equals("ANO"))) {
                    JOptionPane.showMessageDialog(null, "ATENÇÃO !\n\nÉ necessário informar a data de checkOUT");
                } else {

                    dayCheckIN = Integer.parseInt(dayCheckin.getSelectedItem().toString());
                    monthCheckIN = Integer.parseInt(monthCheckin.getSelectedItem().toString());
                    yearCheckIN = Integer.parseInt(yearCheckin.getSelectedItem().toString());
                    checkIn = LocalDate.of(yearCheckIN, Month.of(monthCheckIN), dayCheckIN);

                    dayCheckout = Integer.parseInt(dayCheckOut.getSelectedItem().toString());
                    monthCheckout = Integer.parseInt(monthCheckOut.getSelectedItem().toString());
                    yearCheckout = Integer.parseInt(yearCheckOut.getSelectedItem().toString());

                    checkOut = LocalDate.of(yearCheckout, Month.of(monthCheckout), dayCheckout);
                    informacoesQuarto = new ReservaQuarto(hospedeNovo, camasSelecionadas, frigobar, sacada, banheiroPrivativo, tv, precoDiaria, checkIn, checkOut);
                }
            }

            //checkIn.format(formatter);
        }
        return informacoesQuarto;
    }
    

    public void setCliente(ArrayList<Clientes> getClient) {
        hospedeNovo = getClient;
    }

    public void setDiaria() {
        double precoFrigobar = 150.00;
        double precoSacada = 50.00;
        double precoTV = 35.00;
        double precoBanheiro = 60.00;
        if (comboFrigobar.getSelectedItem().toString().equals("Sim")) {
            precoDiaria += precoFrigobar;
        }
        if (comboTV.getSelectedItem().toString().equals("Sim")) {
            precoDiaria += precoTV;
        }
        if (comboSacada.getSelectedItem().toString().equals("Sim")) {
            precoDiaria += precoSacada;
        }
        if (comboBanheiro.getSelectedItem().toString().equals("Sim")) {
            precoDiaria += precoBanheiro;
        }
    }


    private void comboCasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCasalActionPerformed

    }//GEN-LAST:event_comboCasalActionPerformed

    private void comboSolteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSolteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSolteiroActionPerformed

    private void comboKingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKingActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void comboQueenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQueenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboQueenActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void btnConfirmaReservaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnConfirmaReservaStateChanged

    }//GEN-LAST:event_btnConfirmaReservaStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmaReserva;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> comboBanheiro;
    private javax.swing.JComboBox<String> comboCasal;
    private javax.swing.JComboBox<String> comboFrigobar;
    private javax.swing.JComboBox<String> comboKing;
    private javax.swing.JComboBox<String> comboQueen;
    private javax.swing.JComboBox<String> comboSacada;
    private javax.swing.JComboBox<String> comboSolteiro;
    private javax.swing.JComboBox<String> comboTV;
    private javax.swing.JComboBox<String> dayCheckOut;
    private javax.swing.JComboBox<String> dayCheckin;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPrecoBanheiro;
    private javax.swing.JLabel lblPrecoFrigo;
    private javax.swing.JLabel lblPrecoSacada;
    private javax.swing.JLabel lblPrecoTV;
    private javax.swing.JComboBox<String> monthCheckOut;
    private javax.swing.JComboBox<String> monthCheckin;
    private javax.swing.JComboBox<String> quantidadeCamas;
    private javax.swing.JComboBox<String> yearCheckOut;
    private javax.swing.JComboBox<String> yearCheckin;
    // End of variables declaration//GEN-END:variables
}
