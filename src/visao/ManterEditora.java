package visao;

import controle.ControleEditora;
import javax.swing.JOptionPane;
import modelo.CNPJ;
import modelo.EditorasBEAN;
import modelo.Mensagens;
import modelo.TableModelEditoras;

public class ManterEditora extends javax.swing.JFrame {

    private String modo;
    private TableModelEditoras tabelaEditoraModelo;
    private ControleEditora controle;
    private int index;

    public ManterEditora() {
        initComponents();
        index = 1;
        controle = new ControleEditora();
        modo = "Navegacao";
        setLocationRelativeTo(null);
        tabelaEditoraModelo = new TableModelEditoras(controle.buscarTodasEditoras());
        this.jTableTabelaEditoras.setModel(tabelaEditoraModelo);
        manipulaInterface(modo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaEditoras = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jPanelPlanoDeFundoDados = new javax.swing.JPanel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCnpj = new javax.swing.JLabel();
        jFormattedTextFieldCnpj = new javax.swing.JFormattedTextField();
        jFormattedTextTelefone = new javax.swing.JFormattedTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelBairro1 = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jButtonLimparCampos = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimaparPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter Clientes ");

        jTableTabelaEditoras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTabelaEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTabelaEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaEditorasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTabelaEditorasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaEditoras);

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

        jLabelRazaoSocial.setText("Razão Social");

        jTextFieldRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelTelefone.setText("Telefone:");

        jLabelRua.setText("Rua:");

        jTextFieldRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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

        jLabelCnpj.setText("CNPJ:");

        try {
            jFormattedTextFieldCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/0001-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jFormattedTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelBairro.setText("Bairro:");

        jTextFieldCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelBairro1.setText("Cidade:");

        jLabelEstado.setText("Estado:");

        jTextFieldEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelNumero.setText("Nº:");

        jButtonLimparCampos.setText("Limpar campos");
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPlanoDeFundoDadosLayout = new javax.swing.GroupLayout(jPanelPlanoDeFundoDados);
        jPanelPlanoDeFundoDados.setLayout(jPanelPlanoDeFundoDadosLayout);
        jPanelPlanoDeFundoDadosLayout.setHorizontalGroup(
            jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                                    .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                                            .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelRua)
                                                .addComponent(jLabelCnpj))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                                            .addComponent(jLabelBairro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                                            .addComponent(jLabelBairro1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelNumero)
                                        .addComponent(jLabelEstado))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(125, 125, 125))
                                .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                                    .addComponent(jLabelRazaoSocial)
                                    .addGap(495, 495, 495))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonLimparCampos))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                            .addGap(303, 303, 303)
                            .addComponent(jLabelTelefone)
                            .addGap(18, 18, 18)
                            .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelPlanoDeFundoDadosLayout.setVerticalGroup(
            jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCnpj)
                    .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonLimparCampos)
                    .addComponent(jButtonSalvar)))
        );

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonLimaparPesquisa.setText("Limpar Pesquisa");
        jButtonLimaparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimaparPesquisaActionPerformed(evt);
            }
        });

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
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimaparPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonLimaparPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlanoDeFundoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        index = this.jTableTabelaEditoras.getSelectedRow();
        int i = JOptionPane.showConfirmDialog(rootPane, Mensagens._002() + tabelaEditoraModelo.getValueAt(index, 1) + " " + tabelaEditoraModelo.getValueAt(index, 2) + "?");
        if (i != JOptionPane.YES_OPTION) {
            if (i == JOptionPane.NO_OPTION) {

            }
        } else {
            if (index > -1) {
                controle.delataEditora((int) jTableTabelaEditoras.getValueAt(index, 0));
                tabelaEditoraModelo.setLinhas(controle.buscarTodasEditoras());
                limpaCampos();
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableTabelaEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaEditorasMouseClicked

        index = this.jTableTabelaEditoras.getSelectedRow();

        if (index > -1 && index < this.tabelaEditoraModelo.getRowCount()) {
            modo = "Selecao";
            manipulaInterface(modo);

            this.jTextFieldRazaoSocial.setText((String) tabelaEditoraModelo.getValueAt(index, 1));
            this.jFormattedTextFieldCnpj.setText((String) tabelaEditoraModelo.getValueAt(index, 3));
            this.jFormattedTextTelefone.setText((String) tabelaEditoraModelo.getValueAt(index, 5));
            this.jTextFieldRua.setText((String) tabelaEditoraModelo.getValueAt(index, 6));
            this.jTextFieldBairro.setText((String) tabelaEditoraModelo.getValueAt(index, 7));
            this.jTextFieldCidade.setText((String) tabelaEditoraModelo.getValueAt(index, 8));
            this.jTextFieldEstado.setText((String) tabelaEditoraModelo.getValueAt(index, 9));
            this.jTextFieldNumero.setText((String) tabelaEditoraModelo.getValueAt(index, 10));

        }

    }//GEN-LAST:event_jTableTabelaEditorasMouseClicked

    private void jTableTabelaEditorasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaEditorasMousePressed

        index = this.jTableTabelaEditoras.getSelectedRow();
        if (jTableTabelaEditoras.getSelectedColumn() == 12) {
            tabelaEditoraModelo.inverteValor(jTableTabelaEditoras.getSelectedRow());
            controle.ativaEditora((boolean) jTableTabelaEditoras.getValueAt(index, 12), (int) jTableTabelaEditoras.getValueAt(index, 0));
        }

    }//GEN-LAST:event_jTableTabelaEditorasMousePressed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        tabelaEditoraModelo.setLinhas(controle.buscarEditora(jTextFieldPesquisar.getText()));
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonLimaparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimaparPesquisaActionPerformed
        jTextFieldPesquisar.setText(null);
        tabelaEditoraModelo.setLinhas(controle.buscarTodasEditoras());
    }//GEN-LAST:event_jButtonLimaparPesquisaActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        modo = "Cancelar";
        manipulaInterface(modo);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        index = this.jTableTabelaEditoras.getSelectedRow();

        CNPJ cnpj = new CNPJ(this.jFormattedTextFieldCnpj.getText());

        EditorasBEAN e = new EditorasBEAN((int) jTableTabelaEditoras.getValueAt(index, 0),
                jTextFieldRazaoSocial.getText(),
                jFormattedTextFieldCnpj.getText(),
                jFormattedTextTelefone.getText(),
                jTextFieldRua.getText(),
                jTextFieldBairro.getText(),
                jTextFieldCidade.getText(),
                jTextFieldEstado.getText(),
                jTextFieldNumero.getText(),
                true);

        if (this.verificaCamposPreenchidos()) {
            if (modo.equals("Novo")) {
                if (cnpj.isCNPJ()) {
                    controle.adicionaEditora(e);
                    tabelaEditoraModelo.setLinhas(controle.buscarTodasEditoras());
                    limpaCampos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, Mensagens._005());
                }
            } else if (modo.equals("Editar")) {
                if (cnpj.isCNPJ()) {
                    controle.adicionaEditora(e);
                    tabelaEditoraModelo.setLinhas(controle.buscarTodasEditoras());
                    limpaCampos();
                    modo = "Navegacao";
                    manipulaInterface(modo);
                } else {
                    JOptionPane.showMessageDialog(rootPane, Mensagens._005());
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, Mensagens._001());
            }
        }
            
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new ManterEditora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimaparPesquisa;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCnpj;
    private javax.swing.JFormattedTextField jFormattedTextTelefone;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelBairro1;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelPlanoDeFundoDados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaEditoras;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables

    private void manipulaInterface(String modo) {
        switch (modo) {
            case "Novo":
                habilitaCampoDados(true);
                habilitaBotoesTabela(false);
                habilitaBotoesFormulario(true);
                limpaCampos();
                break;
            case "Navegacao":
                habilitaCampoDados(false);
                habilitaBotoesTabela(false);
                habilitaBotoesFormulario(false);
                limpaCampos();
                break;
            case "Selecao":
                habilitaCampoDados(false);
                habilitaBotoesTabela(true);
                habilitaBotoesFormulario(false);
                this.jButtonNovo.setEnabled(true);
                break;
            case "Cancelar":
                habilitaCampoDados(false);
                habilitaBotoesTabela(false);
                habilitaBotoesFormulario(true);
                limpaCampos();
                this.jButtonNovo.setEnabled(true);
                break;
            case "Editar":
                habilitaCampoDados(true);
                habilitaBotoesFormulario(true);
                this.jButtonExcluir.setEnabled(false);
                this.jButtonNovo.setEnabled(false);
                this.jButtonLimparCampos.setEnabled(false);
                break;
            default:
                break;
        }
    }

    private boolean verificaCamposPreenchidos() {
        return !(this.jTextFieldRazaoSocial.getText().isEmpty()
                && this.jTextFieldRua.getText().isEmpty()
                && this.jTextFieldBairro.getText().isEmpty()
                && this.jTextFieldCidade.getText().isEmpty()
                && this.jTextFieldEstado.getText().isEmpty()
                && this.jTextFieldNumero.getText().isEmpty());
    }

    private boolean verificaCamposFormatadosPreenchidos() {
        return !(this.jFormattedTextFieldCnpj.getText().equals("   .   .   -  ")
                && this.jFormattedTextTelefone.getText().equals("(  )      -    "));
    }

    private void habilitaCampoDados(boolean flag) {
        this.jPanelPlanoDeFundoDados.setEnabled(flag);
        this.jTextFieldRua.setEnabled(flag);
        this.jTextFieldRazaoSocial.setEnabled(flag);
        this.jTextFieldCidade.setEnabled(flag);
        this.jTextFieldBairro.setEnabled(flag);
        this.jTextFieldRua.setEnabled(flag);
        this.jTextFieldEstado.setEnabled(flag);
        this.jTextFieldNumero.setEnabled(flag);
        this.jFormattedTextTelefone.setEnabled(flag);
        this.jFormattedTextFieldCnpj.setEnabled(flag);
        this.jLabelRua.setEnabled(flag);
        this.jLabelRazaoSocial.setEnabled(flag);
        this.jLabelTelefone.setEnabled(flag);
        this.jLabelCnpj.setEnabled(flag);
        this.jLabelRua.setEnabled(flag);
        this.jLabelBairro.setEnabled(flag);
        this.jLabelBairro1.setEnabled(flag);
        this.jLabelNumero.setEnabled(flag);
        this.jLabelEstado.setEnabled(flag);
    }

    private void habilitaBotoesTabela(boolean flag) {
        this.jButtonEditar.setEnabled(flag);
        this.jButtonExcluir.setEnabled(flag);
    }

    private void habilitaBotoesFormulario(boolean flag) {
        this.jButtonSalvar.setEnabled(flag);
        this.jButtonCancelar.setEnabled(flag);
        this.jButtonLimparCampos.setEnabled(flag);
    }

    private void limpaCampos() {
        this.jTextFieldRua.setText(null);
        this.jTextFieldRazaoSocial.setText(null);
        this.jTextFieldCidade.setText(null);
        this.jTextFieldRua.setText(null);
        this.jTextFieldEstado.setText(null);
        this.jTextFieldNumero.setText(null);
        this.jTextFieldBairro.setText(null);
        this.jFormattedTextTelefone.setText(null);
        this.jFormattedTextFieldCnpj.setText(null);
    }
}
