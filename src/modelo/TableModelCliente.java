/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelCliente extends AbstractTableModel {
    
    private ArrayList<ClientesBEAN> linhas;
    private final String[] colunas = new String[]{"Id", "Nome", "Sobrenome", "CPF", "Data Nasç.", "Telefone", "Endereço", "Sexo"};

    public TableModelCliente() {
        this.linhas = new ArrayList<>();
    }

    public TableModelCliente(ArrayList<ClientesBEAN> linhas) {
        this.linhas = linhas;
    }
    
    public void adicionaCliente(ClientesBEAN c){
        this.linhas.add(c);
        fireTableDataChanged();
    }
    
    public void removeCliente(int linha){
        this.linhas.remove(linha);
        fireTableDataChanged();
        //fireTableRowsDeleted(linha, linha);
    }
    
    public ClientesBEAN getCleinte (int linha){
        return this.linhas.get(linha); 
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        super.setValueAt(o, i, i1); //To change body of generated methods, choose Tools | Templates.
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
        
        switch(coluna){
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
                return this.linhas.get(linha).getEndereco();
            case 7:
                return this.linhas.get(linha).getSexo();
            default:
                return -1;
        }
        
    }

    @Override
    public String getColumnName(int coluna) {
        
        return colunas[coluna];
        
    }
    
}
