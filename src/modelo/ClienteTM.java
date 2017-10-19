
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ClienteTM extends AbstractTableModel{
    
    private ArrayList<ClientesBEAN> linhas;
    private String[] colunas = new String[]{"Id", "Nome", "Sobrenome", "CPF", "Data Nasç.", "Telefone", "Endereço", "Sexo"};

    public ClienteTM() {
        linhas = new ArrayList<>();
    }

    public ClienteTM(ArrayList<ClientesBEAN> linhas) {
        this.linhas = linhas;
    }

    @Override
    public int getRowCount() {
        return colunas.length;
    }

    @Override
    public int getColumnCount() {
        return linhas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClientesBEAN c = this.getCliente(rowIndex);
        
        switch(columnIndex){
            case 0:
                return c.getId();
            case 1:
                return c.getNome();
            case 2:
                return c.getSobrenome();
            case 3:
                return c.getCPF();
            case 4:
                return c.getDataNasc();
            case 5:
                return c.getTelefone();
            case 6:
                return c.getEndereco();
            case 7:
                return c.getTelefone();
            default:
                throw new IndexOutOfBoundsException("Coluna não existe");
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        //return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
        if(columnIndex == 0){
            return Integer.class;
        }else{
            return String.class;
        }
        
    }

    public void setValueAt(ClientesBEAN aValue, int rowIndex) {
        ClientesBEAN c = linhas.get(rowIndex);
        
        c.setCPF(aValue.getCPF());
        c.setDataNasc(aValue.getDataNasc());
        c.setEndereco(aValue.getEndereco());
        c.setId(aValue.getId());
        c.setNome(aValue.getNome());
        c.setSobrenome(aValue.getSobrenome());
        c.setTelefone(aValue.getTelefone());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ClientesBEAN getCliente (int indexRow){
        return linhas.get(indexRow);
    }
    
    public void addCliente (ClientesBEAN c){
        linhas.add(c);
        int ultimoIndice = getRowCount() -1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    public void remove(int indexRow){
        linhas.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }
    
    public void addLista(ArrayList<ClientesBEAN> list){
        int tamamnhoAntigo = getRowCount();
        linhas.addAll(list);
        fireTableRowsInserted(tamamnhoAntigo, getRowCount() -1);
    }
    
    public void limpar(){
        linhas.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty(){
        return linhas.isEmpty();
    }
    
}
