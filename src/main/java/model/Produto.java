package model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Fornecedor fornecedor;
    private String dataCadastro;

    //Construtor
    public Produto(int id, String nome, String descricao, Fornecedor fornecedor, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.dataCadastro = dataCadastro;
    }
    
    public Produto() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "- Produto:\n"
				+ "ID = " + this.id + "\nNome = " + this.nome + "\nDescrição = " + this.descricao 
				+ "\nData de Cadastro = " + this.dataCadastro
				+ "\n" + fornecedor.toString();				
	}
    
}
