package model;

import java.util.Date;

public class Consultas {
	Date data;
	String descricao;
	
	public Consultas(Date data, String descricao) {
		this.data = data;
		this.descricao = descricao;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
