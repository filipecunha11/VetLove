package model;

import java.util.Date;

public class Vacinas {
	String nome, data;
	float preco;
	
	public Vacinas(String data, String nome, float preco) {
		this.data = data;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
