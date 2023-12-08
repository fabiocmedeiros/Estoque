package main;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import dao.EstoqueDAO;
import dao.FornecedorDAO;
import dao.ProdutoDAO;
import model.Fornecedor;
import model.Produto;

/**
 *
 * @author Fabio Medeiros, Lucas, Fabio, Ruan
 */

public class Main {

	public static void main(String[] args) {

		// INSERE EXEMPLOS DE CONTEÚDO
		Testes.getInstancia().inserirElementos();

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int escolhaMenu;
		int escolhaSubMenu;

		System.out.println("Olá seja bem vindo ao sistema de gerenciamento de estoque!!");

		do {
			System.out.println("\nMenu Principal - Digite a opção desejada!");

			System.out.println("1 - Produto");
			System.out.println("2 - Fornecedor");
			System.out.println("3 - Estoque");
			System.out.println("0 - Sair");

			escolhaMenu = sc.nextInt();

			switch (escolhaMenu) {
			// PRODUTO
			case 1 -> {

				do {
					System.out.println("Você escolheu a opção 1 - Produto");
					System.out.println("Digite a opção desejada!");

					System.out.println("1 - Cadastar Produto");
					System.out.println("2 - Buscar Produto por Nome");
					System.out.println("3 - Listar Produtos");
					System.out.println("4 - Deletar Produto");
					System.out.println("0 - Voltar");
					escolhaSubMenu = sc.nextInt();

					switch (escolhaSubMenu) {
					// cadastrar produto
					case 1 -> {
						Produto produto = new Produto();
						System.out.println("Cadastre um produto!");

						// esse if e else insere o código aleatório até 100, no id, sem repetir o código
						if (!ProdutoDAO.getInstancia().listar().isEmpty()) {
							boolean tem = true;
							do {
								int cont = random.nextInt(99) + 1;
								int qtdRepetidos = 0;
								for (Produto p : ProdutoDAO.getInstancia().listar()) {
									if (p.getId() == cont) {
										qtdRepetidos++;
									}
								}
								if (qtdRepetidos == 0) {
									tem = false;
									produto.setId(cont);
								}
							} while (tem);

						} else {
							produto.setId(random.nextInt(99) + 1);
						}

						System.out.println("Informe o nome do produto!");
						produto.setNome(sc.next());
						System.out.println("Informe a descrição do produto!");
						produto.setDescricao(sc.next());

						System.out.println("Informe o nome do fornecedor!");
//						produto.setFornecedor(FornecedorDAO.getInstancia().buscar(sc.next()));
						produto.setFornecedor(FornecedorDAO.getInstancia().buscar("ACER"));

						// pega a data de cadastro
						String data = LocalDate.now().toString();
						data = data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
						produto.setDataCadastro(data);

						ProdutoDAO.getInstancia().cadastrar(produto);

					}
					// buscar produto por nome
					case 2 -> {
						System.out.println("Busque um produto por nome!");
						System.out.println("Informe o nome do produto!");
						String nomeProduto = sc.next();
						Produto retornoProduto = ProdutoDAO.getInstancia().buscar(nomeProduto);
						if (retornoProduto != null) {
							System.out.println(retornoProduto.toString());
						} else {
							System.out.println("Produto inexistente!");
						}
					}
					// listar produtos
					case 3 -> {
						for (Produto produto : ProdutoDAO.getInstancia().listar()) {
							System.out.println(produto.toString());
						}
					}
					// deletar produto
					case 4 -> {
						System.out.println("Delete um produto!");
						System.out.println("Informe o nome do produto a ser deletado!");
						String nomeProduto = sc.next();
						Produto retornoProduto = ProdutoDAO.getInstancia().buscar(nomeProduto);
						if (retornoProduto != null) {
							ProdutoDAO.getInstancia().deletar(retornoProduto);
							System.out.println("Produto Deletado Com Sucesso!");
						} else {
							System.out.println("Produto inexistente!\n");
						}
					}

					}

				} while (escolhaSubMenu != 0);
			}

			// FORNECEDOR
			case 2 -> {
				do {
					System.out.println("Você escolheu a opção 2 - Fornecedor");
					System.out.println("Digite a opção desejada!");

					System.out.println("1 - Cadastar Fornecedor");
					System.out.println("2 - Buscar Fornecedor por Nome");
					System.out.println("3 - Listar Fornecedor");
					System.out.println("4 - Deletar Fornecedor");
					System.out.println("0 - Voltar");

					escolhaSubMenu = sc.nextInt();

					switch (escolhaSubMenu) {
					// cadastrar fornecedor
					case 1 -> {
						Fornecedor fornecedor = new Fornecedor();
						System.out.println("Cadastre um fornecedor!");

						// esse if e else insere o código aleatório até 100, no id, sem repetir o código
						if (!FornecedorDAO.getInstancia().listar().isEmpty()) {
							boolean tem = true;
							do {
								int cont = random.nextInt(99) + 1;
								int qtdRepetidos = 0;
								for (Fornecedor f : FornecedorDAO.getInstancia().listar()) {
									if (f.getId() == cont) {
										qtdRepetidos++;
									}
								}
								if (qtdRepetidos == 0) {
									tem = false;
									fornecedor.setId(cont);
								}
							} while (tem);

						} else {
							fornecedor.setId(random.nextInt(99) + 1);
						}

						System.out.println("Informe o nome do fornecedor!");
						fornecedor.setNome(sc.next());
						System.out.println("Informe o CPF do fornecedor!");
						fornecedor.setCpf(sc.next());
						System.out.println("Informe o RG do fornecedor!");
						fornecedor.setRg(sc.next());
						System.out.println("Informe o CNPJ do fornecedor!");
						fornecedor.setCnpj(sc.next());
						System.out.println("Informe o telefone do fornecedor!");
						fornecedor.setTelefone(sc.next());
						System.out.println("Informe o email do fornecedor!");
						fornecedor.setEmail(sc.next());
						System.out.println("Informe a data do nascimento do fornecedor!");
						fornecedor.setDataNascimento(sc.next());
						System.out.println("Informe o logradouro do fornecedor!");
						fornecedor.setLogradouro(sc.next());
						System.out.println("Informe o bairro do fornecedor!");
						fornecedor.setBairro(sc.next());
						System.out.println("Informe a cidade do fornecedor!");
						fornecedor.setCidade(sc.next());
						System.out.println("Informe o estado do fornecedor!");
						fornecedor.setEstado(sc.next());
						System.out.println("Informe o CEP do fornecedor!");
						fornecedor.setCep(sc.next());
						// pega a data de cadastro
						String data = LocalDate.now().toString();
						data = data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
						fornecedor.setDataCadastro(data);

						FornecedorDAO.getInstancia().cadastrar(fornecedor);

					}
					// buscar fornecedor por nome
					case 2 -> {
						System.out.println("Busque um fornecedor por nome!");
						System.out.println("Informe o nome do fornecedor!");
						String nomeFornecedor = sc.next();
						Fornecedor retornoFornecedor = FornecedorDAO.getInstancia().buscar(nomeFornecedor);
						if (retornoFornecedor != null) {
							System.out.println(retornoFornecedor.toString());
						} else {
							System.out.println("Fornecedor inexistente!");
						}
					}
					// listar fornecedor
					case 3 -> {
						for (Fornecedor fornecedor : FornecedorDAO.getInstancia().listar()) {
							System.out.println(fornecedor.toString());
						}
					}
					// deletar fornecedor
					case 4 -> {
						System.out.println("Delete um fornecedor!");
						System.out.println("Informe o nome do fornecedor a ser deletado!");
						String nomeFornecedor = sc.next();
						Fornecedor retornoFornecedor = FornecedorDAO.getInstancia().buscar(nomeFornecedor);
						if (retornoFornecedor != null) {
							FornecedorDAO.getInstancia().deletar(retornoFornecedor);
							System.out.println("Fornecedor Deletado Com Sucesso!");
						} else {
							System.out.println("Fornecedor inexistente!\n");
						}
					}

					}
				} while (escolhaSubMenu != 0);
			}

			// ESTOQUE
			case 3 -> {
				System.out.println("Você escolheu a opção 3 - Estoque");

				do {
					System.out.println("Digite a opção desejada!");

					System.out.println("1 - Atualizar Estoque");
					System.out.println("2 - Adicionar Estoque");
					System.out.println("3 - Remover Estoque");
					System.out.println("4 - Listar Produtos Disponiveis");
					System.out.println("0 - Voltar");
					escolhaSubMenu = sc.nextInt();

					switch (escolhaSubMenu) {

					case 1 -> {
						System.out.println("Atualize um produto do estoque!");
						System.out.println("Informe o nome do produto a ser atualizado!");
						Produto produto = ProdutoDAO.getInstancia().buscar(sc.next());
						System.out
						.println("Informe a quantidade do produto '" + produto.getNome() + "' a ser atualizada!");
				int quantidadeProdutoEstoque = sc.nextInt();
				EstoqueDAO.getInstancia().atualizarProduto(produto, quantidadeProdutoEstoque);
					}
					case 2 -> {
						System.out.println("Adicione produto no estoque!");
						System.out.println("Informe o nome do produto a ser adicionado!");
						Produto produto = ProdutoDAO.getInstancia().buscar(sc.next());
						System.out
								.println("Informe a quantidade do produto '" + produto.getNome() + "' a ser adicionado!");
						int quantidadeProdutoEstoque = sc.nextInt();
						EstoqueDAO.getInstancia().adicionarProduto(produto, quantidadeProdutoEstoque);
					}
					case 3 -> {
						System.out.println("Remova produto no estoque!");
						System.out.println("Informe o nome do produto a ser removido!");
						Produto produto = ProdutoDAO.getInstancia().buscar(sc.next());
						System.out
								.println("Informe a quantidade do produto '" + produto.getNome() + "' a ser subtraído!");
						int quantidadeProdutoEstoque = sc.nextInt();
						EstoqueDAO.getInstancia().removerProduto(produto, quantidadeProdutoEstoque);
					}
					case 4 -> {
						EstoqueDAO.getInstancia().listarProdutos();
						System.out.println();
					}

					}

				} while (escolhaSubMenu != 0);
			}

			case 0 -> System.out.println("Obrigado e volte sempre!!");

			default -> System.out.println("opção invalida!");

			}

		} while (escolhaMenu != 0);
	}
}
