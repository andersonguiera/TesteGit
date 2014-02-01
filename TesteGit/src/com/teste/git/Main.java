package com.teste.git;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Anderson");
		pessoa.setSobrenome("Guiera");
		System.out.println("Olá " + pessoa.getNomeCompleto());
		Endereco endereco = new Endereco();
		
		endereco.setRua("Carlos Gomes");
		endereco.setNumero(23);
		endereco.setBairro("Centro");
		endereco.setCidade("Curitiba");
		System.out.println(endereco.getEnderecoCompleto());
	}

}
