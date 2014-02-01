package com.teste.git;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		
		endereco.setRua("Carlos Gomes");
		endereco.setNumero(23);
		endereco.setBairro("Centro");
		endereco.setCidade("Curitiba");
		System.out.println(endereco.getEnderecoCompleto());
	}

}
