package com.teste.git;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private List<Endereco> enderecos;
	
	public Pessoa() {
		enderecos = new ArrayList<Endereco>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	public void addEndereco(Endereco endereco) {
		enderecos.add(endereco);
	}
	
	public void removeEndereco(Endereco endereco) {
		enderecos.remove(endereco);
	}
	
	public Iterator<Endereco> getEnderecos() {
		return enderecos.iterator();
	}
}
