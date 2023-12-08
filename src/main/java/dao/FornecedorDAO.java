package dao;

import java.util.ArrayList;
import model.Fornecedor;

public class FornecedorDAO implements DAOGeral<Fornecedor>{

	private static FornecedorDAO fornecedorDAO;
	private ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	private FornecedorDAO() {

	}

	// padrão singleton.
	public static FornecedorDAO getInstancia() {
		if (fornecedorDAO == null) {
			fornecedorDAO = new FornecedorDAO();
		}
		return fornecedorDAO;
	}

	public void cadastrar(Fornecedor fornecedor) {
		fornecedores.add(fornecedor);
	}	

	public Fornecedor buscar(String nomeFornecedor) {
		for (Fornecedor fornecedorBusca : fornecedores) {
			if (nomeFornecedor.equals(fornecedorBusca.getNome())) {
				return fornecedorBusca;
			}
		}
		return null;
	}

	public ArrayList<Fornecedor> listar() {
		return this.fornecedores;
	}
	
	public void deletar(Fornecedor fornecedor) {
		fornecedores.remove(fornecedor);
	}

}
