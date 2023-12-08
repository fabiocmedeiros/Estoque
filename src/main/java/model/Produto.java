package estoque;

public class Produto {
    private int id;
    private int codigo;
    private String nome;
    private String descricao;
    private String fornecedor;
    private String dataCadastro;

    //Construtor
    public Produto(int id, int codigo, String nome, String descricao, String fornecedor, String dataCadastro) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.dataCadastro = dataCadastro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
