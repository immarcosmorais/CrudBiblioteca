
package TesteControleCliente;

import controle.ControleCliente;
import modelo.ClientesBEAN;

public class EditaCliente {
    
    public static void main(String[] args) {
        
        ControleCliente controle = new ControleCliente();
        ClientesBEAN Cliente = new ClientesBEAN(8, 
                "Fulano", 
                "Santos", 
                "111.111.111-60", 
                "1977-02-01", 
                "(64) 99999-9999", 
                "Rua B", 
                "Femenino", 
                true);
        
        controle.updateCliente(Cliente);
        
    }
    
}
