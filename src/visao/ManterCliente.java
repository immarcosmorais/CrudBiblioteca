package visao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClientesBEAN;
import modelo.Mensagens;

public class ManterCliente extends javax.swing.JFrame {

    ArrayList<ClientesBEAN> listaCientes;
    String modo;

    public ManterCliente() {
        initComponents();
        modo = "Navegacao";
        setLocationRelativeTo(null);
        this.listaCientes = new ArrayList<>();
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
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelDataDeNasc = new javax.swing.JLabel();
        jTextFieldDataDeNasc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter Clientes ");

        jTableTabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Sobrenome", "Data de Nasç.", "Telefone", "Endereço", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableTabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaClientes);

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

        jLabelSobrenome.setText("Sobrenome:");

        jLabelTelefone.setText("Telefone:");

        jLabelEndereco.setText("Endereço:");

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
                    .addComponent(jLabelDataDeNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanelPlanoDeFundoDadosLayout.createSequentialGroup()
                        .addComponent(jRadioButtonMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFemenino))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
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
                    .addComponent(jLabelDataDeNasc)
                    .addComponent(jTextFieldDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlanoDeFundoDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int i = JOptionPane.showConfirmDialog(null, Mensagens._002() + listaCientes.get(index).getNome() + " " + listaCientes.get(index).getSobrenome() + "?");
        if(i == JOptionPane.YES_OPTION){
            if(index > -1){
                listaCientes.remove(index);
                carregaTabela();
            }
        }else if(i == JOptionPane.NO_OPTION){
            
        }
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        if (modo.equals("Novo")) {

            String s = null;

            if ((this.jRadioButtonFemenino.isSelected() || this.jRadioButtonMasculino.isSelected())

                    && (this.jTextFieldDataDeNasc.getText() != null
                    && this.jTextFieldEndereco.getText() != null
                    && this.jTextFieldNome.getText() != null
                    && this.jTextFieldSobrenome.getText() != null
                    && this.jTextFieldTelefone.getText() != null)) {

                if (this.jRadioButtonFemenino.isSelected()) {
                    s = "Femenino";
                } else {
                    s = "Masculino";
                }

                ClientesBEAN c = new ClientesBEAN(0,
                        this.jTextFieldNome.getText(),
                        this.jTextFieldSobrenome.getText(),
                        this.jTextFieldDataDeNasc.getText(),
                        this.jTextFieldTelefone.getText(),
                        this.jTextFieldEndereco.getText(),
                        s,
                        true);

                listaCientes.add(c);
                limpaCampos();
                carregaTabela();
                modo = "Navegacao";
                manipulaInterface(modo);
            } else {
                JOptionPane.showMessageDialog(null, Mensagens._001());
            }

        } else if (modo.equals("Editar")) {
            int index = this.jTableTabelaClientes.getSelectedRow();
            listaCientes.get(index).setDataNasc(this.jTextFieldDataDeNasc.getText());
            listaCientes.get(index).setEndereco(this.jTextFieldEndereco.getText());
            listaCientes.get(index).setNome(this.jTextFieldNome.getText());
            listaCientes.get(index).setSobrenome(this.jTextFieldSobrenome.getText());
            listaCientes.get(index).setTelefone(this.jTextFieldTelefone.getText());
            if(this.jRadioButtonFemenino.isSelected()){
                listaCientes.get(index).setSexo("Femenino");
            }else{
                listaCientes.get(index).setSexo("Masculino");
            }
            modo = "Navegacao";
            manipulaInterface(modo);
            carregaTabela();
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        modo = "Cancelar";
        manipulaInterface(modo);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableTabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaClientesMouseClicked

        int index = this.jTableTabelaClientes.getSelectedRow();
        if (index > -1 && index < this.listaCientes.size()) {
            modo = "Selecao";
            manipulaInterface(modo);
            ClientesBEAN c = listaCientes.get(index);
            this.jTextFieldDataDeNasc.setText(c.getDataNasc());
            this.jTextFieldEndereco.setText(c.getEndereco());
            this.jTextFieldNome.setText(c.getNome());
            this.jTextFieldSobrenome.setText(c.getSobrenome());
            this.jTextFieldTelefone.setText(c.getTelefone());
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
    private javax.swing.JTextField jTextFieldDataDeNasc;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    private javax.swing.JTextField jTextFieldTelefone;
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

    public void ordenaLista(){
        Collections.sort(listaCientes, new Comparator(){
            @Override
            public int compare (Object o1, Object o2){
                ClientesBEAN c1 = (ClientesBEAN) o1;
                ClientesBEAN c2 = (ClientesBEAN) o2;
                return c1.getId() < c2.getId() ? - 1 : (c1.getId() > c2.getId() ? + 1 : 0);
            }
        });
    }
    
    public void carregaTabela() {

        //Modo menos eficiente
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
        this.jTableTabelaClientes.setModel(modelo);
        ordenaLista();
    }

    private void habilitaCampoDados(boolean flag) {
        this.jPanelPlanoDeFundoDados.setEnabled(flag);
        this.jTextFieldEndereco.setEnabled(flag);
        this.jTextFieldNome.setEnabled(flag);
        this.jTextFieldSobrenome.setEnabled(flag);
        this.jTextFieldTelefone.setEnabled(flag);
        this.jTextFieldDataDeNasc.setEnabled(flag);
        this.jLabelEndereco.setEnabled(flag);
        this.jLabelNome.setEnabled(flag);
        this.jLabelDataDeNasc.setEnabled(flag);
        this.jLabelSexo.setEnabled(flag);
        this.jLabelSobrenome.setEnabled(flag);
        this.jLabelTelefone.setEnabled(flag);
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
        this.jTextFieldTelefone.setText(null);
        this.jTextFieldDataDeNasc.setText(null);
        this.jRadioButtonFemenino.setSelected(false);
        this.jRadioButtonMasculino.setSelected(false);
    }
}
