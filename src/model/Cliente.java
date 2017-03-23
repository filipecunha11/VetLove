package model;

import java.util.ArrayList;

public class Cliente {

	String nome, morada, email, telefone;
	int id;
	ArrayList<Animais> animais = new ArrayList<Animais>();
	
	public Cliente(int id, String nome, String morada, String email, String telefone, ArrayList<Animais> animais) {
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
		this.animais = animais;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Animais> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animais> animais) {
		this.animais = animais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
