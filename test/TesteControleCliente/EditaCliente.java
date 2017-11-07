
package TesteControleCliente;

import controle.ControleCliente;
import modelo.ClientesBEAN;

public class EditaCliente {
    
    public static void main(String[] args) {
        
        ControleCliente controle = new ControleCliente();
        ClientesBEAN Cliente = new ClientesBEAN(
                15,
                "Marcos", 
                "Ribeiro", 
                "111-111-111", 
                "1996-02-02", 
                "888888888", 
                "44", 
                "777", 
                "7777", 
                "7777", 
                "7777", 
                "77777", 
                true);
        
        controle.atualizaCliente(Cliente);
        
    }
    
}
