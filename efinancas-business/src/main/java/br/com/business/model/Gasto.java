package br.com.business.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gasto {

	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private double valor;
	private Date dataGasto;

	public Gasto(){}
	
	public Gasto(long id, String nome, double valor, Date dataGasto) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.dataGasto = dataGasto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataGasto() {
		return dataGasto;
	}

	public void setDataGasto(Date dataGasto) {
		this.dataGasto = dataGasto;
	}

}
