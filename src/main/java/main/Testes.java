package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import dao.FornecedorDAO;
import dao.ProdutoDAO;
import model.Fornecedor;
import model.Produto;

public class Testes {

	private static Testes testes;

	private Testes() {

	}

	// padrão singleton.
	public static Testes getInstancia() {
		if (testes == null) {
			testes = new Testes();
		}
		return testes;
	}

	public void inserirElementos() {
		// pega a data de cadastro
		String data = LocalDate.now().toString();
		data = data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);

		//EXEMPLOS FORNECEDORES
		Fornecedor f1 = new Fornecedor(1, "VITARELLA", "CPF101", "RG101", "CNPJ101", "8888-8888", "EMAIL101", data,
				"29/12/1983", "BR 101", "PRAZERES", "JABOATÃO", "PE", "CEP101");

		Fornecedor f2 = new Fornecedor(2, "COCA-COLA", "CPF102", "RG102", "CNPJ102", "7777-7777", "EMAIL102", data,
				"01/07/1999", "RUA MEM DE SÁ", "ARRUDA", "RECIFE", "PE", "CEP102");

		Fornecedor f3 = new Fornecedor(3, "BRASTEMP", "CPF102", "RG102", "CNPJ102", "7777-7777", "EMAIL102", data,
				"01/07/1999", "AV PRINCIPAL", "BAIRROPB", "PATOS", "PB", "CEP102");

		Fornecedor f4 = new Fornecedor(4, "ACER", "CPF103", "RG103", "CNPJ103", "6666-6666", "EMAIL103", "01/10/2023",
				data, "AV NATAL", "BAIRRO NATAL", "NATAL", "RN", "CEP103");

		FornecedorDAO.getInstancia().cadastrar(f1);
		FornecedorDAO.getInstancia().cadastrar(f2);
		FornecedorDAO.getInstancia().cadastrar(f3);
		FornecedorDAO.getInstancia().cadastrar(f4);
		
		//EXEMPLOS DE PRODUTOS
		Produto p1 = new Produto(1, "COCA-COLA ZERO", "REFRIGERANTE COCA-COLA ZERO 2L", f1, data);
		Produto p2 = new Produto(2, "TRELOSO", "BISCOITO TRELOSO", f2, data);
		Produto p3 = new Produto(3, "LAVAROUPA", "LAVADOURA DE ROUPAS 10L", f3, data);
		Produto p4 = new Produto(4, "NOTEBOOK", "NOTEBOOK GAMER 1080TI", f4, data);
		
		ProdutoDAO.getInstancia().cadastrar(p1);
		ProdutoDAO.getInstancia().cadastrar(p2);
		ProdutoDAO.getInstancia().cadastrar(p3);
		ProdutoDAO.getInstancia().cadastrar(p4);
		
		
		
		
	}

	public static void main(String[] args) {

		// pega a data de cadastro
		String data = LocalDate.now().toString();
		data = data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);

		Fornecedor f1 = new Fornecedor(101, "VITARELLA", "CPF101", "RG101", "CNPJ101", "8888-8888", "EMAIL101", data,
				"29/12/1983", "BR 101", "PRAZERES", "JABOATÃO", "PE", "CEP101");

		Fornecedor f2 = new Fornecedor(102, "COCA-COLA", "CPF102", "RG102", "CNPJ102", "7777-7777", "EMAIL102", data,
				"01/07/1999", "RUA MEM DE SÁ", "ARRUDA", "RECIFE", "PE", "CEP102");

		Fornecedor f3 = new Fornecedor(103, "BRASTEMP", "CPF102", "RG102", "CNPJ102", "7777-7777", "EMAIL102", data,
				"01/07/1999", "AV PRINCIPAL", "BAIRROPB", "PATOS", "PB", "CEP102");

		Fornecedor f4 = new Fornecedor(104, "ACER", "CPF103", "RG103", "CNPJ103", "6666-6666", "EMAIL103", "01/10/2023",
				data, "AV NATAL", "BAIRRO NATAL", "NATAL", "RN", "CEP103");

		FornecedorDAO.getInstancia().cadastrar(f1);
		FornecedorDAO.getInstancia().cadastrar(f2);
		FornecedorDAO.getInstancia().cadastrar(f3);
		FornecedorDAO.getInstancia().cadastrar(f4);

//		try {
//			System.out.println(FornecedorDAO.getInstancia().buscarFornecedor(f2).toString());
//		} catch (Exception e) {
//			System.out.println("Fornecedor Inexistente");
//		}

		// LISTAR
		for (Fornecedor fornecedor : FornecedorDAO.getInstancia().listar()) {
			System.out.println(fornecedor.toString());
		}

		// REMOVER
		System.out.println("=============================");
		FornecedorDAO.getInstancia().deletar(f3);

		for (Fornecedor fornecedor : FornecedorDAO.getInstancia().listar()) {
			System.out.println(fornecedor.toString());
		}

		System.out.println("=============================Busca");

		Fornecedor fBusca = new Fornecedor();
		fBusca.setId(103);

		// LISTAR
		System.out.println("=============================");
		for (Fornecedor fornecedor : FornecedorDAO.getInstancia().listar()) {
			System.out.println(fornecedor.toString());
		}

//		String data = LocalDate.now().toString();
//
//		System.out.println(data);
//
//		data = data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
//
//		System.out.println();
//		System.out.println(data);

	}

}
