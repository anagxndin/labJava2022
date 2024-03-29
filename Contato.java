public class Contato {

    private int codigo;
    String nome;
    String email;
    String telefone;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //void = sem retorno
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public Contato(int codigo, String nome, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    
}
