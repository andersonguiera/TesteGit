package com.teste.git;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Anderson");
		pessoa.setSobrenome("Guiera");
		System.out.println("Olá " + pessoa.getNomeCompleto());
	}

}
