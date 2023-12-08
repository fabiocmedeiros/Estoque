package model;

public class Fornecedor extends Pessoa {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;        
    
    public Fornecedor(int id, String nome, String cpf, String rg, String cnpj, String telefone, String email,
			String dataCadastro, String dataNascimento, String logradouro, String bairro, String cidade, String estado,
			String cep) {
		super(id, nome, cpf, rg, cnpj, telefone, email, dataCadastro, dataNascimento);
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Fornecedor() {
    	super();
    }  

	@Override
	public String toString() {
		return "Fornecedor:" + 
				super.toString() + 
				"\nLogradouro = " + this.logradouro + "\nBairro = " + this.bairro 
				+ "\nCidade = " + this.cidade + "\nEstado = " + this.estado 
				+ "\nCEP = " + this.cep + "\n";
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}    
    
}
