package controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.EditorasBEAN;

public class EditorasDAO {

    private static EditorasDAO instance;

    public EditorasDAO() {
        MySQLDAO.getConnection();
    }

    public static EditorasDAO getInstance() {
        if (instance == null) {
            instance = new EditorasDAO();
        }
        return instance;
    }

    public long create(EditorasBEAN editora) {
        String query = "INSERT INTO `editoras` "
                + "(`razao_social`, "
                + "`cnpj`, "
                + "`telefone`, "
                + "`rua`, "
                + "`bairro`, "
                + "`cidade`, "
                + "`estado`, "
                + "`numero`) "
                + "VALUES (?,?,?,?,?,?,?,?)";

        return MySQLDAO.executeQuery(query,
                editora.getRazaoSocial(),
                editora.getCnpj(),
                editora.getTelefone(),
                editora.getRua(),
                editora.getBairro(),
                editora.getCidade(),
                editora.getEstado(),
                editora.getNumero());
    }

    public void update(EditorasBEAN editora) {

        String query = "UPDATE EDITORAS SET "
                + "razao_social = ?, "
                + "cnpj = ?, "
                + "telefone = ?, "
                + "rua = ?, "
                + "bairro = ?, "
                + "cidade = ?, "
                + "estado = ?, "
                + "numero = ? "
                + "where id = ?";

        MySQLDAO.executeQuery(query,
                editora.getRazaoSocial(),
                editora.getCnpj(),
                editora.getTelefone(),
                editora.getRua(),
                editora.getBairro(),
                editora.getCidade(),
                editora.getEstado(),
                editora.getEstado(),
                editora.getNumero(),
                editora.getId());
    }

    public void delete(EditorasBEAN editora) {
        MySQLDAO.executeQuery("DELETE FROM EDITORAS WHERE id = ?", editora.getId());
    }

    public void delete(int id) {
        MySQLDAO.executeQuery("DELETE FROM EDITORAS WHERE id = ?", id);
    }

    public void ativa(boolean flag, int id) {
        MySQLDAO.executeQuery("update editoras set ativo = ? where id = ?", flag, id);
    }
    
    public ArrayList<EditorasBEAN> buscarTodos(){
        return listarTodos("select * from editoras order by id");
    }

    private ArrayList<EditorasBEAN> listarTodos(String query) {

        ArrayList<EditorasBEAN> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EditorasBEAN(
                        rs.getInt("id"), 
                        rs.getString("razao_social"),
                        rs.getString("cnpj"),
                        rs.getString("telefone"), 
                        rs.getString("rua"),
                        rs.getString("bairro"),
                        rs.getString("cidade"), 
                        rs.getString("estado"),
                        rs.getString("numero"),
                        rs.getObject("ativo", Boolean.class)));
                

            }
            rs.close();
        } catch (SQLException e) {
            System.err.println("erro: " + e.getMessage());
        }
        return lista;
    }
    
    public ArrayList<EditorasBEAN> buscar (String nome) {

        ArrayList<EditorasBEAN> lista = new ArrayList<>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from editoras where nome like '%" + nome + "%'");
        try {
            while (rs.next()) {
                lista.add(new EditorasBEAN(
                        rs.getInt("id"), 
                        rs.getString("razao_social"),
                        rs.getString("cnpj"),
                        rs.getString("telefone"), 
                        rs.getString("rua"),
                        rs.getString("bairro"),
                        rs.getString("cidade"), 
                        rs.getString("estado"),
                        rs.getString("numero"),
                        rs.getObject("ativo", Boolean.class)));
                

            }
            rs.close();
        } catch (SQLException e) {
            System.err.println("erro: " + e.getMessage());
        }
        return lista;
    }

}
