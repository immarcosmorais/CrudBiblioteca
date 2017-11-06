/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteControleCliente;

import controle.ControleCliente;
import modelo.ClientesBEAN;

/**
 *
 * @author marco
 */
public class AddCliente {
    public static void main(String[] args) {
        ControleCliente controle = new ControleCliente();
        ClientesBEAN Cliente = new ClientesBEAN(0, 
                "Fulano", 
                "Santos", 
                "111.111.111-60", 
                "1977-02-01", 
                "(64) 99999-9999", 
                "Rua B", 
                "Femenino", 
                true);
        controle.addCliente(Cliente);
    }
}
