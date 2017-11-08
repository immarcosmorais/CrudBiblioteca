
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelEditoras extends AbstractTableModel{
    
    private ArrayList<EditorasBEAN> linhas;
    private final String[] colunas = new String[]{
            "Id",
            "Razão Social",
            "CNPJ",
            "Telefone",
            "Rua",
            "Bairro",
            "Cidade",
            "Estado",
            "Numero",
            "Ativo"
            };

    public TableModelEditoras() {
        linhas = new ArrayList<>();
    }

    public TableModelEditoras(ArrayList<EditorasBEAN> linhas) {
        this.linhas = linhas;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 9){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inverteValor(int linha){
        this.linhas.get(linha).setAtivo(!this.linhas.get(linha).isAtivo());
    }
    
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public Object getValueAt(int linha, int coluna){
        if(linha < 0){
            return linha;
        }else{
            switch(coluna){
                case 0: return this.linhas.get(linha).getId();
                case 1: return this.linhas.get(linha).getRazaoSocial();
                case 2: return this.linhas.get(linha).getCnpj();
                case 3: return this.linhas.get(linha).getTelefone();
                case 4: return this.linhas.get(linha).getRua();
                case 5: return this.linhas.get(linha).getBairro();
                case 6: return this.linhas.get(linha).getCidade();
                case 7: return this.linhas.get(linha).getEstado();
                case 8: return this.linhas.get(linha).getNumero();
                case 9: return this.linhas.get(linha).isAtivo();
                default: return  -1;
            }
        }
    }

    public void setLinhas(ArrayList<EditorasBEAN> linhas) {
        this.linhas = linhas;
        fireTableDataChanged();
    }
}
