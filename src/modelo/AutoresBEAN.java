
package modelo;

public class AutoresBEAN {
    
    private int id;
    private String nome;
    private String dataNasc;
    private byte sexo;
    private boolean ativo;

    public AutoresBEAN() {
    }

    public AutoresBEAN(int id, String nome, String dataNasc, byte sexo, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public byte getSexo() {
        return sexo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
