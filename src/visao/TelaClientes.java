package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClientesBEAN;

public final class TelaClientes extends javax.swing.JFrame {

    ArrayList<ClientesBEAN> listaCientes;

    public TelaClientes() {
        initComponents();
        setLocationRelativeTo(null);
        this.listaCientes = new ArrayList<>();
        carregaTabela();
        ManipulaInterface("Navegar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableTabelaClientes = new javax.swing.JTable();
        ButtonNovo = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        PanelPlanoDeFundo = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        LabelSobrenome = new javax.swing.JLabel();
        TextFieldSobrenome = new javax.swing.JTextField();
        TextFieldDataDeNasc = new javax.swing.JTextField();
        LabelDataNasc = new javax.swing.JLabel();
        LabelTelefone = new javax.swing.JLabel();
        TextFieldTelefone = new javax.swing.JTextField();
        TextFieldEndereco = new javax.swing.JTextField();
        LabelEndereco = new javax.swing.JLabel();
        LabelSexo = new javax.swing.JLabel();
        RadioButtonFemenino = new javax.swing.JRadioButton();
        RadioButtonMasculino = new javax.swing.JRadioButton();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter Clientes");

        TableTabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sobrenome", "Data Nasç.", "Telefone", "Endereço", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTabelaClientes);
        if (TableTabelaClientes.getColumnModel().getColumnCount() > 0) {
            TableTabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        ButtonNovo.setText("Novo");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        ButtonEditar.setText("Editar");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        PanelPlanoDeFundo.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        LabelNome.setText("Nome:");

        LabelSobrenome.setText("Sobrenome:");

        TextFieldDataDeNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDataDeNascActionPerformed(evt);
            }
        });

        LabelDataNasc.setText("Data de Nasçimento:");

        LabelTelefone.setText("Telefone:");

        LabelEndereco.setText("Endereço:");

        LabelSexo.setText("Sexo:");

        RadioButtonFemenino.setText("Femenino");
        RadioButtonFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFemeninoActionPerformed(evt);
            }
        });

        RadioButtonMasculino.setText("Masculino");
        RadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMasculinoActionPerformed(evt);
            }
        });

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPlanoDeFundoLayout = new javax.swing.GroupLayout(PanelPlanoDeFundo);
        PanelPlanoDeFundo.setLayout(PanelPlanoDeFundoLayout);
        PanelPlanoDeFundoLayout.setHorizontalGroup(
            PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlanoDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDataNasc)
                    .addComponent(LabelSobrenome)
                    .addComponent(LabelNome)
                    .addComponent(LabelTelefone)
                    .addComponent(LabelEndereco)
                    .addComponent(LabelSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCancelar))
                    .addGroup(PanelPlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(RadioButtonFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioButtonMasculino))
                    .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(TextFieldSobrenome)
                        .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldDataDeNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(TextFieldTelefone)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        PanelPlanoDeFundoLayout.setVerticalGroup(
            PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlanoDeFundoLayout.createSequentialGroup()
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSobrenome)
                    .addComponent(TextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataNasc)
                    .addComponent(TextFieldDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefone)
                    .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEndereco)
                    .addComponent(TextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSexo)
                    .addComponent(RadioButtonFemenino)
                    .addComponent(RadioButtonMasculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalvar)
                    .addComponent(ButtonCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNovo)
                    .addComponent(ButtonExcluir)
                    .addComponent(ButtonEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldDataDeNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDataDeNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDataDeNascActionPerformed

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
        ManipulaInterface("Novo");
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void RadioButtonFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFemeninoActionPerformed
        this.RadioButtonMasculino.setSelected(false);
    }//GEN-LAST:event_RadioButtonFemeninoActionPerformed

    private void RadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMasculinoActionPerformed
        this.RadioButtonFemenino.setSelected(false);
    }//GEN-LAST:event_RadioButtonMasculinoActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        ManipulaInterface("Cancelar");
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed

        if (this.RadioButtonFemenino.isSelected() || this.RadioButtonMasculino.isSelected()) {
            if (this.TextFieldDataDeNasc.getText() != null
                    && this.TextFieldEndereco.getText() != null
                    && this.TextFieldNome.getText() != null
                    && this.TextFieldSobrenome.getText() != null
                    && this.TextFieldTelefone.getText() != null) {

                String s = null;
                if (this.RadioButtonFemenino.isSelected()) {
                    s = "Femenino";
                } else {
                    s = "Masculino";
                }
                ClientesBEAN c = new ClientesBEAN(0,
                        this.TextFieldNome.getText(),
                        this.TextFieldSobrenome.getText(),
                        this.TextFieldDataDeNasc.getText(),
                        this.TextFieldTelefone.getText(),
                        this.TextFieldEndereco.getText(),
                        s,
                        true);
                listaCientes.add(c);
                limpaCampos();
                carregaTabela();

            } else {
                JOptionPane.showMessageDialog(null, "Necessario preencher todos os campos!");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Necessario preencher todos os campos!");
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        ManipulaInterface("Editar");
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        ManipulaInterface("Excluir");
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void TableTabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTabelaClientesMouseClicked
        ManipulaInterface("Selecao");
        int index = this.TableTabelaClientes.getSelectedRow();
        ClientesBEAN c = listaCientes.get(index);
        this.TextFieldTelefone.setText(c.getTelefone());
        this.TextFieldEndereco.setText(c.getEndereco());
        this.TextFieldNome.setText(c.getNome());
        this.TextFieldSobrenome.setText(c.getSobrenome());
        this.TextFieldDataDeNasc.setText(c.getDataNasc());
        
    }//GEN-LAST:event_TableTabelaClientesMouseClicked

    public void limpaCampos() {
        this.TextFieldTelefone.setText(null);
        this.TextFieldEndereco.setText(null);
        this.TextFieldNome.setText(null);
        this.TextFieldSobrenome.setText(null);
        this.TextFieldDataDeNasc.setText(null);

    }

    public final void habilitaCamposTextoParaEdicao(boolean flag) {
        this.TextFieldDataDeNasc.setEnabled(flag);
        this.TextFieldEndereco.setEnabled(flag);
        this.TextFieldNome.setEnabled(flag);
        this.TextFieldSobrenome.setEnabled(flag);
        this.TextFieldTelefone.setEnabled(flag);
        this.TextFieldDataDeNasc.setEditable(flag);
        this.TextFieldEndereco.setEditable(flag);
        this.TextFieldNome.setEditable(flag);
        this.TextFieldSobrenome.setEditable(flag);
        this.TextFieldTelefone.setEditable(flag);
    }

    public final void habilitaBotoesDados(boolean flag) {
        this.ButtonSalvar.setEnabled(flag);
        this.ButtonCancelar.setEnabled(flag);
        this.RadioButtonFemenino.setEnabled(flag);
        this.RadioButtonMasculino.setEnabled(flag);
    }

    public final void limpaBotoesRadios(boolean flag) {
        this.RadioButtonFemenino.setSelected(flag);
        this.RadioButtonMasculino.setSelected(flag);
    }

    public final void habilitaLabels(boolean flag) {
        this.LabelDataNasc.setEnabled(flag);
        this.LabelEndereco.setEnabled(flag);
        this.LabelNome.setEnabled(flag);
        this.LabelSexo.setEnabled(flag);
        this.LabelSobrenome.setEnabled(flag);
        this.LabelTelefone.setEnabled(flag);
    }

    // Modo - eficiente de carregar a tabela
    public void carregaTabela() {
        // modelo para tabela
        Object Colunas[] = {"Id", "Nome", "Sobrenome", "Data Nasç.", "Telefone", "Endereço", "Sexo"};
        DefaultTableModel modelo = new DefaultTableModel(Colunas, 0);

        for (ClientesBEAN listaCiente : this.listaCientes) {
            Object linha[] = {listaCiente.getId(),
                listaCiente.getNome(),
                listaCiente.getSobrenome(),
                listaCiente.getDataNasc(),
                listaCiente.getTelefone(),
                listaCiente.getEndereco(),
                listaCiente.getSexo()};

            modelo.addRow(linha);
        }

        this.TableTabelaClientes.setModel(modelo);
    }

    public void ManipulaInterface(String modo) {
        switch (modo) {
            case "Navegar":
                limpaCampos();
                habilitaBotoesDados(false);
                this.ButtonNovo.setEnabled(true);
                this.ButtonEditar.setEnabled(false);
                this.ButtonExcluir.setEnabled(false);
                habilitaLabels(false);
                habilitaCamposTextoParaEdicao(false);
                limpaBotoesRadios(false);
                this.PanelPlanoDeFundo.setEnabled(false);
                break;
            case "Novo":
                limpaCampos();
                habilitaBotoesDados(true);
                habilitaCamposTextoParaEdicao(true);
                limpaBotoesRadios(false);
                habilitaLabels(true);
                this.PanelPlanoDeFundo.setEnabled(true);
                break;
            case "Editar":
                habilitaBotoesDados(true);
                this.ButtonNovo.setEnabled(false);
                habilitaCamposTextoParaEdicao(true);
                limpaBotoesRadios(false);
                habilitaLabels(true);
                this.PanelPlanoDeFundo.setEnabled(true);
                break;
            case "Excluir":
                limpaCampos();
                habilitaBotoesDados(false);
                this.ButtonNovo.setEnabled(true);
                habilitaLabels(false);
                habilitaCamposTextoParaEdicao(false);
                limpaBotoesRadios(false);
                this.PanelPlanoDeFundo.setEnabled(false);
                break;
            case "Cancelar":
                limpaCampos();
                habilitaBotoesDados(false);
                habilitaCamposTextoParaEdicao(false);
                this.ButtonNovo.setEnabled(true);
                limpaBotoesRadios(false);
                habilitaLabels(false);
                this.PanelPlanoDeFundo.setEnabled(false);
                break;
            case "Selecao":
                this.ButtonEditar.setEnabled(true);
                this.ButtonExcluir.setEnabled(true);
                this.ButtonNovo.setEnabled(false);
                habilitaBotoesDados(false);
                habilitaLabels(false);
                habilitaCamposTextoParaEdicao(false);
                limpaBotoesRadios(false);
                this.PanelPlanoDeFundo.setEnabled(false);
                break;
            default:
                System.out.println("Modo invalido");
                break;
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
        // Variables declaration - do not modify 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelDataNasc;
    private javax.swing.JLabel LabelEndereco;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSexo;
    private javax.swing.JLabel LabelSobrenome;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JPanel PanelPlanoDeFundo;
    private javax.swing.JRadioButton RadioButtonFemenino;
    private javax.swing.JRadioButton RadioButtonMasculino;
    private javax.swing.JTable TableTabelaClientes;
    private javax.swing.JTextField TextFieldDataDeNasc;
    private javax.swing.JTextField TextFieldEndereco;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldSobrenome;
    private javax.swing.JTextField TextFieldTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
