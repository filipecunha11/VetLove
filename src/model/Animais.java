package model;

import java.util.ArrayList;
import java.util.Date;

public class Animais {
	String classificacao, raca, data_nasc;
	
	Ficha ficha;
	
	public Animais(String classificacao, String raca, String data_nasc2) {
		this.classificacao = classificacao;
		this.raca = raca;
		this.data_nasc = data_nasc2;
	}
	
	public String getClassificacao() {
		return classificacao;
	}
	
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getData_nasc() {
		return data_nasc;
	}
	
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	
}
