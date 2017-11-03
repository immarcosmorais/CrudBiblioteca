package controle;

import java.util.ArrayList;
import modelo.ClientesBEAN;

public class ClienteControle {

    public ClienteControle() {
    }
    
    public void addCliente(ClientesBEAN cliente){
        ClienteDAO.getInstance().create(cliente);
    }
    
    public void updateContato(ClientesBEAN cliente){
        ClienteDAO.getInstance().update(cliente);
    }

    public void deleteCliente(ClientesBEAN cliente) {
        ClienteDAO.getInstance().delete(cliente);
    }

    public ClientesBEAN findPessoa(int id){
        return ClienteDAO.getInstance().findCliente(id);
    }
    
    public int findIdContato(ClientesBEAN cliente){
        return ClienteDAO.getInstance().findId(cliente);
    }
    
    public Boolean isExist(int id){
        return ClienteDAO.getInstance().isExist(id);
    }
    
    public ArrayList<ClientesBEAN> listaCliente(){
       return ClienteDAO.getInstance().findAllClientes();
    }
    
}
