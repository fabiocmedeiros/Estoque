package estoque;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Fornecedor(int id, String nome, String cpf, String rg, String telefone, String email, String dataCadastro, String dataNascimento,
                      String cnpj, String logradouro, String bairro, String cidade, String estado, String cep) {
        super(id, nome, cpf, rg, telefone, email, dataCadastro, dataNascimento);
        this.cnpj = cnpj;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }    
}
