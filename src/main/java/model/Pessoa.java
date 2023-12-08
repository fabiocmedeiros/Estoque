package model;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String cnpj;
    private String telefone;
    private String email;
    private String dataCadastro;
    private String dataNascimento;

    // Construtor
    public Pessoa(int id, String nome, String cpf, String rg, String cnpj, String telefone, String email, String dataCadastro, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
    }
    
    public Pessoa() {
    	
    }	
    
    @Override
	public String toString() {
		return "\nID = " + this.id + "\nNome = " + this.nome + "\nCPF = " + this.cpf 
				+ "\nRG = " + this.rg + "\nCNPJ = " + this.cnpj
				+ "\nTelefone = " + this.telefone
				+ "\nE-mail = " + this.email + "\nData de Cadastro = " + this.dataCadastro 
				+ "\nData de Nascimento = " + this.dataNascimento;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
    
}
