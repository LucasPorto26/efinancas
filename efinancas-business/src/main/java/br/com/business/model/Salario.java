package br.com.business.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Salario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	@NotNull
	private long id;
	
	@Column(name="salarioBruto")
	@NotNull
	private double salarioBruto;
	
	@Column(name="salarioLiquido")
	private double salarioLiquido;
	
	@Column(name="primeiroSalario")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date primeiroSalario;
	
	@Column(name="seegundoSalario")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date segundoSalario;

	public Salario() {
	}

	public Salario(long id, double salarioBruto, double salarioLiquido,
			Date primeiroSalario, Date segundoSalario) {
		super();
		this.id = id;
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioLiquido;
		this.primeiroSalario = primeiroSalario;
		this.segundoSalario = segundoSalario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Date getPrimeiroSalario() {
		return primeiroSalario;
	}

	public void setPrimeiroSalario(Date primeiroSalario) {
		this.primeiroSalario = primeiroSalario;
	}

	public Date getSegundoSalario() {
		return segundoSalario;
	}

	public void setSegundoSalario(Date segundoSalario) {
		this.segundoSalario = segundoSalario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salario other = (Salario) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
