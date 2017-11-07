package controle;

import java.util.ArrayList;
import modelo.ClientesBEAN;

public class ControleCliente {

    public ControleCliente() {
    }
    
    public void adicionaCliente(ClientesBEAN cliente){
        ClienteDAO.getInstance().create(cliente);
    }
    
    public void atualizaCliente(ClientesBEAN cliente){
        ClienteDAO.getInstance().update(cliente);
    } 

    public void deletaCliente(ClientesBEAN cliente) {
        ClienteDAO.getInstance().delete(cliente);
    }
    
    public void deletaCliente(int id) {
        ClienteDAO.getInstance().delete(id);
    }
    
    public void ativaCliente(boolean flag, int id){
        ClienteDAO.getInstance().ativa(flag, id);
    }
    
    public ClientesBEAN buscarCliente(int id){
        return ClienteDAO.getInstance().buscar(id);
    }
    
    public int buscarCliente(ClientesBEAN cliente){
        return ClienteDAO.getInstance().buscar(cliente);
    }
    
    public Boolean isExist(int id){
        return ClienteDAO.getInstance().isExist(id);
    }
    
    public ArrayList<ClientesBEAN> buscarTodosClientes(){
       return ClienteDAO.getInstance().buscarTodos();
    }
    
}
