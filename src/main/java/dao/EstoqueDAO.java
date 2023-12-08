package dao;

import java.util.HashMap;
import java.util.Map;

import main.Testes;
import model.Produto;

public class EstoqueDAO {
		private static EstoqueDAO estoqueDAO;  
        private Map<Produto, Integer> produtos = new HashMap<>();

        private EstoqueDAO() {
        	
        }
        
    	// padrão singleton.
    	public static EstoqueDAO getInstancia() {
    		if (estoqueDAO == null) {
    			estoqueDAO = new EstoqueDAO();
    		}
    		return estoqueDAO;
    	}
    	
    	public void atualizarProduto(Produto produto, int novaQuantidade) {
            produtos.put(produto, novaQuantidade);
            System.out.println("Estoque de " + produto.getNome() + " atualizado para " + novaQuantidade + " unidades.");
        }

        public void adicionarProduto(Produto produto, int quantidade) {
            if (produtos.containsKey(produto)) {
                int quantidadeAtual = produtos.get(produto);
                produtos.put(produto, quantidadeAtual + quantidade);
            } else {
                produtos.put(produto, quantidade);
            }
            System.out.println(quantidade + " unidades de " + produto.getNome() + " foram adicionadas ao estoque.\n");
        }

        public void removerProduto(Produto produto, int quantidade) {
            if (produtos.containsKey(produto)) {
                int quantidadeAtual = produtos.get(produto);
                if (quantidadeAtual >= quantidade) {
                    produtos.put(produto, quantidadeAtual - quantidade);
                    System.out.println(quantidade + " unidades de " + produto.getNome() + " foram removidas do estoque.");
                } else {
                    System.out.println("Quantidade insuficiente de " + produto.getNome() + " no estoque.");
                }
            } else {
                System.out.println(produto.getNome() + " não encontrado no estoque.");
            }
        }

        public void listarProdutos() {
            System.out.println("Produtos disponíveis no estoque:");
            for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
                System.out.println(entry.getKey().getNome() + " : " + entry.getValue() + " unidades");
            }
        }
}
