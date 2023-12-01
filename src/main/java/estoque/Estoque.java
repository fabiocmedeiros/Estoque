package estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
        private Map<String, Integer> produtos;

        public Estoque() {
            this.produtos = new HashMap<>();
        }

        public void adicionarProduto(String produto, int quantidade) {
            if (produtos.containsKey(produto)) {
                int quantidadeAtual = produtos.get(produto);
                produtos.put(produto, quantidadeAtual + quantidade);
            } else {
                produtos.put(produto, quantidade);
            }
            System.out.println(quantidade + " unidades de " + produto + " foram adicionadas ao estoque.");
        }

        public void removerProduto(String produto, int quantidade) {
            if (produtos.containsKey(produto)) {
                int quantidadeAtual = produtos.get(produto);
                if (quantidadeAtual >= quantidade) {
                    produtos.put(produto, quantidadeAtual - quantidade);
                    System.out.println(quantidade + " unidades de " + produto + " foram removidas do estoque.");
                } else {
                    System.out.println("Quantidade insuficiente de " + produto + " no estoque.");
                }
            } else {
                System.out.println(produto + " não encontrado no estoque.");
            }
        }

        public void atualizarProduto(String produto, int novaQuantidade) {
            produtos.put(produto, novaQuantidade);
            System.out.println("Estoque de " + produto + " atualizado para " + novaQuantidade + " unidades.");
        }

        public void listarProdutos() {
            System.out.println("Produtos disponíveis no estoque:");
            for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
            }
        }
}
