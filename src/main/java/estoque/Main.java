package estoque;

import java.util.Scanner;

/**
 *
 * @author Fabio Medeiros, Lucas, Fabio, Ruan
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhaMenu;
        int escolhaSubMenu;

        System.out.println("Olá seja bem vindo ao sistema de gerenciamento de estoque!!");

        do {
            System.out.println("Digite a opção desejada!");

            System.out.println("1 - Produto");
            System.out.println("2 - Fornecedor");
            System.out.println("3 - Estoque");
            System.out.println("0 - Sair");

            escolhaMenu = sc.nextInt();

            switch (escolhaMenu){
                case 1 -> {
                    System.out.println("Você escolheu a opção 1 - Produto");
                    do {
                        System.out.println("Digite a opção desejada!");
                        
                        System.out.println("1 - Cadastar Produto");
                        System.out.println("2 - Buscar Produto por Nome");
                        System.out.println("3 - Listar Produtos");
                        System.out.println("4 - Deletar Produto");
                        System.out.println("0 - Voltar");
                        escolhaSubMenu = sc.nextInt();
                        
                    }while(escolhaSubMenu != 0);
        }

                case 2 -> {
                    System.out.println("Você escolheu a opção 2 - Fornecedor");

                    do {
                        System.out.println("Digite a opção desejada!");

                        System.out.println("1 - Cadastar Fornecedor");
                        System.out.println("2 - Buscar Fornecedor por Nome");
                        System.out.println("3 - Listar Fornecedor");
                        System.out.println("4 - Deletar Fornecedor");
                        System.out.println("0 - Voltar");
                        escolhaSubMenu = sc.nextInt();

                        switch (escolhaSubMenu){
                            case 1 -> {
                            }
                            case 2 -> {
                            }
                            case 3 -> {
                            }
                            case 4 -> {
                            }
                            case 0 -> {
                            }
                        }
                        //cadastrarFornecedor();
                                                
                        
                        
                    }while(escolhaSubMenu != 0);
        }

                case 3 -> {
                    System.out.println("Você escolheu a opção 3 - Estoque");
                    System.out.println("Você escolheu a opção 2 - Fornecedor");

                    do {
                        System.out.println("Digite a opção desejada!");

                        System.out.println("1 - Atualizar Estoque");
                        System.out.println("2 - Adicionar Estoque");
                        System.out.println("3 - Remover Estoque");
                        System.out.println("4 - Listar Produtos Disponiveis");
                        System.out.println("0 - Voltar");
                        escolhaSubMenu = sc.nextInt();

                    }while(escolhaSubMenu != 0);
        }

                case 0 -> System.out.println("Obrigado e volte sempre!!");

                    default -> System.out.println("opção invalida!");

            }

        }while (escolhaMenu != 0);
    }
}
