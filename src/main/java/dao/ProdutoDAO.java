package dao;

import java.util.ArrayList;
import model.Produto;

public class ProdutoDAO implements DAOGeral<Produto>{

	private static ProdutoDAO produtoDAO;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	private ProdutoDAO() {

	}

	// padrão singleton.
	public static ProdutoDAO getInstancia() {
		if (produtoDAO == null) {
			produtoDAO = new ProdutoDAO();
		}
		return produtoDAO;
	}

	public void cadastrar(Produto produto) {
		produtos.add(produto);
	}	

	public Produto buscar(String nomeProduto) {
		for (Produto produtoBusca : produtos) {
			if (nomeProduto.equals(produtoBusca.getNome())) {
				return produtoBusca;
			}
		}
		return null;
	}

	public ArrayList<Produto> listar() {
		return this.produtos;
	}
	
	public void deletar(Produto produto) {
		produtos.remove(produto);
	}

}
