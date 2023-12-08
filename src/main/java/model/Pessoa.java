package estoque;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String dataCadastro;
    private String dataNascimento;

    // Construtor
    public Pessoa(int id, String nome, String cpf, String rg, String telefone, String email, String dataCadastro, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
