
package TesteControleCliente;

import controle.ControleCliente;
import java.util.ArrayList;
import modelo.ClientesBEAN;

public class TestaConexao {
    public static void main(String[] args) {
        ArrayList<ClientesBEAN> lista = new ArrayList<>();
        ControleCliente controle = new ControleCliente();
        lista = controle.buscarTodosClientes();
        System.out.println("tamanho da lisa: " + lista.size());
        for (ClientesBEAN lista1 : lista) {
            System.out.println(lista1.toString());
        }
    }
}
