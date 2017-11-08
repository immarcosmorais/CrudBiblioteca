
package TesteEditora;

import controle.ControleEditora;
import java.util.ArrayList;
import modelo.EditorasBEAN;

public class Teste {
    
    public static void add(){
        ControleEditora controle = new ControleEditora();
        EditorasBEAN editora = new EditorasBEAN(0, "Saraiva", "61.539.516/0001-01", "(64) 99999-9999", "Rua A", "Centro", "Rio Verde", "Goias", "S/n", true);
        controle.adicionaEditora(editora);
    }
    
    public static void update(){
        ControleEditora controle = new ControleEditora();
        EditorasBEAN editora = new EditorasBEAN(3, "Saraiva", "61.539.516/0001-01", "(64) 99999-9999", "Rua A", "Centro", "Rio Verde", "Goias", "15", true);
        controle.atualizaEditora(editora);
    }
    
    public static ArrayList<EditorasBEAN> busca(String termo){
        ArrayList<EditorasBEAN> lista = null;
        ControleEditora controle = new ControleEditora();
        lista = controle.buscarEditora(termo);
        return lista;
    } 
    
    public static void main(String[] args) {
        //add();
        //update();
        for (EditorasBEAN lista : busca("s")) {
            System.out.println(lista);
        }
        
    }
    
}
