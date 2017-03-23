package model;

import java.util.ArrayList;

public class Ficha {
	ArrayList<Vacinas> vacinas = new ArrayList<Vacinas>();
	ArrayList<Consultas> consultas = new ArrayList<Consultas>();
	Cliente cliente;
	Animais animal;
	
	public Ficha(ArrayList<Vacinas> vacinas, Cliente cliente, Animais animal) {
		this.vacinas = vacinas;
		this.cliente = cliente;
		this.animal = animal;
	}

	public ArrayList<Vacinas> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<Vacinas> vacinas) {
		this.vacinas = vacinas;
	}	
}
