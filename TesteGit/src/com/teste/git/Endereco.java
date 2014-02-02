package com.teste.git;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String UF;
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}

	private int numero;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getEnderecoCompleto() {
		return "Rua " + rua + ", " + numero + "\n" + bairro + "\n" + cidade + " - " + UF; 
	}
}
