/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelClientes extends AbstractTableModel {

    private ArrayList<ClientesBEAN> linhas;
    private final String[] colunas = new String[]{
        "Id", 
        "Nome", 
        "Sobrenome", 
        "CPF", 
        "Data Nasç.", 
        "Telefone", 
        "Rua",
        "Bairro",
        "Cidade",
        "Estado",
        "Numero",
        "Sexo",
        "Ativo"};

//    Class[] types = new Class[]{
//        java.lang.Integer.class,
//        java.lang.String.class,
//        java.lang.String.class,
//        java.lang.String.class,
//        java.lang.String.class,
//        java.lang.String.class,
//        java.lang.String.class,
//        java.lang.String.class,
//        java.lang.Boolean.class
//    };

    public TableModelClientes() {
        this.linhas = new ArrayList<>();
    }
    
    public TableModelClientes(ArrayList<ClientesBEAN> linhas) {
        this.linhas = linhas;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 12) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inverteValor(int linha) {
        this.linhas.get(linha).setAtivo(!this.linhas.get(linha).isAtivo());
    }

    public void adicionaCliente(ClientesBEAN c) {
        this.linhas.add(c);
        fireTableDataChanged();
    }

    public void removeCliente(int linha) {
        this.linhas.remove(linha);
        fireTableDataChanged();
        //fireTableRowsDeleted(linha, linha);
    }

    public ClientesBEAN getCliente(int linha) {
        return this.linhas.get(linha);
    }

    public void setValueAt(ClientesBEAN aValue, int rowIndex) {
        
        linhas.get(rowIndex).setCPF(aValue.getCPF());
        linhas.get(rowIndex).setDataNasc(aValue.getDataNasc());
        linhas.get(rowIndex).setRua(aValue.getRua());
        linhas.get(rowIndex).setBairro(aValue.getBairro());
        linhas.get(rowIndex).setCidade(aValue.getCidade());
        linhas.get(rowIndex).setEstado(aValue.getEstado());
        linhas.get(rowIndex).setNumero(aValue.getNumero());
        linhas.get(rowIndex).setNome(aValue.getNome());
        linhas.get(rowIndex).setSexo(aValue.getSexo());
        linhas.get(rowIndex).setSobrenome(aValue.getSobrenome());
        linhas.get(rowIndex).setTelefone(aValue.getTelefone());
        linhas.get(rowIndex).setAtivo(aValue.isAtivo());

        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
        fireTableCellUpdated(rowIndex, 8);
        fireTableCellUpdated(rowIndex, 9);
        fireTableCellUpdated(rowIndex, 10);
        fireTableCellUpdated(rowIndex, 11);
        fireTableCellUpdated(rowIndex, 12);
    }

    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        if (linha < 0) {
            
            return linha;
            
        } else {

            switch (coluna) {
                case 0:
                    return this.linhas.get(linha).getId();
                case 1:
                    return this.linhas.get(linha).getNome();
                case 2:
                    return this.linhas.get(linha).getSobrenome();
                case 3:
                    return this.linhas.get(linha).getCPF();
                case 4:
                    return this.linhas.get(linha).getDataNasc();
                case 5:
                    return this.linhas.get(linha).getTelefone();
                case 6:
                    return this.linhas.get(linha).getRua();
                case 7:
                    return this.linhas.get(linha).getBairro();
                case 8:
                    return this.linhas.get(linha).getCidade();
                case 9:
                    return this.linhas.get(linha).getEstado();
                case 10:
                    return this.linhas.get(linha).getNumero();
                case 11:
                    return this.linhas.get(linha).getSexo();
                case 12:
                    return this.linhas.get(linha).isAtivo();
                default:
                    return -1;
            }
        }

    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    public void setLinhas(ArrayList<ClientesBEAN> linhas) {
        this.linhas = linhas;
        fireTableDataChanged();
    }

}
