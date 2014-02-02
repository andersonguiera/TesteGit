package com.teste.git;

import java.util.Iterator;

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
		endereco.setUF("PR");
				
		pessoa.addEndereco(endereco);
		
		endereco = new Endereco();
		endereco.setRua("Vicente Machado");
		endereco.setNumero(135);
		endereco.setBairro("Centro Cívico");
		endereco.setCidade("Curitiba");
		endereco.setUF("PR");
		
		pessoa.addEndereco(endereco);
		
		Iterator<Endereco> it = pessoa.getEnderecos();
		
		System.out.println(pessoa.getNomeCompleto());
		while(it.hasNext()) {
			endereco = it.next();
			
			System.out.println(endereco.getEnderecoCompleto());
		}
		
	}

}
