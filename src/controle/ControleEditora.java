
package controle;

import java.util.ArrayList;
import modelo.EditorasBEAN;

public class ControleEditora {

    public ControleEditora() {
    }
    
    public void adicionaEditora(EditorasBEAN editoras){
        EditorasDAO.getInstance().create(editoras);
    }
    
    public void atualizaEditora(EditorasBEAN editora){
        EditorasDAO.getInstance().update(editora);
    }
    
    public void delataEditora(EditorasBEAN editora){
        EditorasDAO.getInstance().delete(editora);
    }
    
    public void delataEditora(int id){
        EditorasDAO.getInstance().delete(id);
    }
    
    public void ativaEditora(boolean flag, int id){
         EditorasDAO.getInstance().ativa(flag, id);
    }
    
    public ArrayList<EditorasBEAN>  buscarEditora(String nome){
        return EditorasDAO.getInstance().buscar(nome);
    }
    
}
