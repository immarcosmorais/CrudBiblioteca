package visao;

import controle.ControleCliente;
import java.util.ArrayList;
import modelo.CPF;
import javax.swing.JOptionPane;
import modelo.TableModelCliente;
import modelo.ClientesBEAN;
import modelo.Data;
import modelo.Mensagens;

public class ManterCliente extends javax.swing.JFrame {

    private String modo;
    private TableModelCliente tabelaClienteModelo;
    private ControleCliente controle;
    
    public ManterCliente() {
        
        initComponents();
        controle = new ControleCliente();
        modo = "Navegacao";
        setLocationRelativeTo(null);
        tabelaClienteModelo = new TableModelCliente(controle.listaCliente());
        this.jTableTabelaClientes.setModel(tabelaClienteModelo);
        manipulaInterface(modo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaClientes = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jPanelPlanoDeFundoDados = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelSobrenome = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelDataDeNasc = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextDataNasc = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter Clientes ");

        jTableTabelaClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sobrenome", "CPF", "Data de Nasç.", "Telefone", "Endereço", "Sexo", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaClientes);
        if (jTableTabelaClientes.getColumnModel().getColumnCount() > 0) {
            jTableTabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jPanelPlanoDeFundoDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelSobrenome.setText("Sobrenome:");

        jTextFieldSobrenome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelTelefone.setText("Telefone:");

        jLabelEndereco.setText("Endereço:");

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelSexo.setText("Sexo:");

        jRadioButtonMasculino.setText("Masculino");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jRadioButtonFemenino.setText("Femenino");
        jRadioButtonFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemeninoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelDataDeNasc.setText("Data de Nasc.:");

        jLabelCpf.setText("CPF:");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jFormattedTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jFormattedTextDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextDataNasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelPlanoDeFundoDadosLayout = new javax.swing.GroupLayout(jPanelPlanoDeFundoDados);
        jPanelPlanoDeFundoDados.setLayout(jPanelPlanoDeFundoDadosLayout);
        jPanelPlanoDeFundoDadosLayout.setHorizontalGroup(
            jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelSobrenome)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelDataDeNasc)
                    .addComponent(jLabelCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                        .addComponent(jRadioButtonMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFemenino))
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jFormattedTextDataNasc)
                    .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addComponent(jTextFieldEndereco)
                    .addComponent(jTextFieldSobrenome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPlanoDeFundoDadosLayout.setVerticalGroup(
            jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSobrenome)
                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataDeNasc)
                    .addComponent(jFormattedTextDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPlanoDeFundoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlanoDeFundoDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        modo = "Novo";
        manipulaInterface(modo);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        modo = "Editar";
        manipulaInterface(modo);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        modo = "Navegacao";
        manipulaInterface(modo);
        int index = this.jTableTabelaClientes.getSelectedRow();
        int i = JOptionPane.showConfirmDialog(rootPane, Mensagens._002() + tabelaClienteModelo.getValueAt(index, 1) + " " + tabelaClienteModelo.getValueAt(index, 2) + "?");
        if (i != JOptionPane.YES_OPTION) {
            if (i == JOptionPane.NO_OPTION) {

            }
        } else {
            if (index > -1) {
                tabelaClienteModelo.removeCliente(index);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        int index = this.jTableTabelaClientes.getSelectedRow();

        String s = null;
        if (this.jRadioButtonFemenino.isSelected()) {
            s = "Femenino";
        } else {
            s = "Masculino";
        }

        ClientesBEAN c = new ClientesBEAN(0,
                this.jTextFieldNome.getText(),
                this.jTextFieldSobrenome.getText(),
                this.jFormattedTextFieldCpf.getText(),
                this.jFormattedTextDataNasc.getText(),
                this.jFormattedTextTelefone.getText(),
                this.jTextFieldEndereco.getText(),
                s,
                true);

        CPF cpf = new CPF(this.jFormattedTextFieldCpf.getText());
        Data dataNasc = new Data(this.jFormattedTextDataNasc.getText() + " " + "00:00", Data.BarraComHora);
        Data hoje = new Data();

        if (this.verificaCamposFormatadosPreenchidos() && this.verificaCamposPreenchidos() && this.verificaRadioButtonSelecionado()) {
            if (modo.equals("Novo")) {
                if (cpf.isCPF()) {
                    if (hoje.getTimestamp().getTime() > dataNasc.getTimestamp().getTime()) {
                        tabelaClienteModelo.adicionaCliente(c);
                        limpaCampos();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, Mensagens._004());
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, Mensagens._003());
                }
            } else if (modo.equals("Editar")) {
                if (cpf.isCPF()) {
                    if (hoje.getTimestamp().getTime() > dataNasc.getTimestamp().getTime()) {
                        tabelaClienteModelo.setValueAt(c, index);
                        limpaCampos();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, Mensagens._004());
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, Mensagens._003());
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, Mensagens._001());
        }

        // Caso não queira validação de CPF e Data
//        if (modo.equals("Novo")) {
//            if (this.verificaCamposFormatadosPreenchidos() && this.verificaCamposPreenchidos() && this.verificaRadioButtonSelecionado()) {
//                tabelaClienteModelo.adicionaCliente(c);
//            } else {
//                JOptionPane.showMessageDialog(rootPane, Mensagens._001());
//            }
//        } else if (modo.equals("Editar")) {
//            tabelaClienteModelo.setValueAt(c, index);
//        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        modo = "Cancelar";
        manipulaInterface(modo);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableTabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaClientesMouseClicked

        int index = this.jTableTabelaClientes.getSelectedRow();

        if (index > -1 && index < this.tabelaClienteModelo.getRowCount()) {
            modo = "Selecao";
            manipulaInterface(modo);

            this.jTextFieldNome.setText((String) tabelaClienteModelo.getValueAt(index, 1));
            this.jTextFieldSobrenome.setText((String) tabelaClienteModelo.getValueAt(index, 2));
            this.jFormattedTextFieldCpf.setText((String) tabelaClienteModelo.getValueAt(index, 3));
            this.jFormattedTextDataNasc.setText((String) tabelaClienteModelo.getValueAt(index, 4));
            this.jFormattedTextTelefone.setText((String) tabelaClienteModelo.getValueAt(index, 5));
            this.jTextFieldEndereco.setText((String) tabelaClienteModelo.getValueAt(index, 6));

        }

    }//GEN-LAST:event_jTableTabelaClientesMouseClicked

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        this.jRadioButtonFemenino.setSelected(false);
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jRadioButtonFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemeninoActionPerformed
        this.jRadioButtonMasculino.setSelected(false);
    }//GEN-LAST:event_jRadioButtonFemeninoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextTelefone;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataDeNasc;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelPlanoDeFundoDados;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaClientes;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables

    private void manipulaInterface(String modo) {
        switch (modo) {
            case "Novo":
                habilitaCampoDados(true);
                habilitaBotoesEditarExcluir(false);
                limpaCampos();
                break;
            case "Navegacao":
                habilitaCampoDados(false);
                habilitaBotoesEditarExcluir(false);
                limpaCampos();
                break;
            case "Selecao":
                habilitaCampoDados(false);
                habilitaBotoesEditarExcluir(true);
                this.jButtonNovo.setEnabled(true);
                break;
            case "Cancelar":
                habilitaCampoDados(false);
                habilitaBotoesEditarExcluir(false);
                limpaCampos();
                this.jButtonNovo.setEnabled(true);
                break;
            case "Editar":
                habilitaCampoDados(true);
                this.jButtonExcluir.setEnabled(false);
                this.jButtonNovo.setEnabled(false);
                break;
            default:
                break;
        }
    }

    private boolean verificaRadioButtonSelecionado() {
        return this.jRadioButtonFemenino.isSelected() || this.jRadioButtonMasculino.isSelected();
    }

    private boolean verificaCamposPreenchidos() {
        return !(this.jTextFieldNome.getText().isEmpty() && this.jTextFieldSobrenome.getText().isEmpty() && this.jTextFieldEndereco.getText().isEmpty());
    }

    private boolean verificaCamposFormatadosPreenchidos() {
        return !(this.jFormattedTextFieldCpf.getText().equals("   .   .   -  ")
                && this.jFormattedTextDataNasc.getText().equals("  /  /    ")
                && this.jFormattedTextTelefone.getText().equals("(  )      -    "));
    }

    private void habilitaCampoDados(boolean flag) {
        this.jPanelPlanoDeFundoDados.setEnabled(flag);
        this.jTextFieldEndereco.setEnabled(flag);
        this.jTextFieldNome.setEnabled(flag);
        this.jTextFieldSobrenome.setEnabled(flag);
        this.jFormattedTextTelefone.setEnabled(flag);
        this.jFormattedTextDataNasc.setEnabled(flag);
        this.jFormattedTextFieldCpf.setEnabled(flag);
        this.jLabelEndereco.setEnabled(flag);
        this.jLabelNome.setEnabled(flag);
        this.jLabelDataDeNasc.setEnabled(flag);
        this.jLabelSexo.setEnabled(flag);
        this.jLabelSobrenome.setEnabled(flag);
        this.jLabelTelefone.setEnabled(flag);
        this.jLabelCpf.setEnabled(flag);
        this.jButtonSalvar.setEnabled(flag);
        this.jButtonCancelar.setEnabled(flag);
        this.jRadioButtonFemenino.setEnabled(flag);
        this.jRadioButtonMasculino.setEnabled(flag);
    }

    private void habilitaBotoesEditarExcluir(boolean flag) {
        this.jButtonEditar.setEnabled(flag);
        this.jButtonExcluir.setEnabled(flag);
    }

    private void limpaCampos() {
        this.jTextFieldEndereco.setText(null);
        this.jTextFieldNome.setText(null);
        this.jTextFieldSobrenome.setText(null);
        this.jFormattedTextTelefone.setText(null);
        this.jFormattedTextDataNasc.setText(null);
        this.jFormattedTextFieldCpf.setText(null);
        this.jRadioButtonFemenino.setSelected(false);
        this.jRadioButtonMasculino.setSelected(false);
    }
}
