package br.com.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.business.model.Salario;
import br.com.business.repositorio.SalarioRepositorio;

@Service
public class GastoService {

	@Autowired
	private SalarioRepositorio salarioRepositorio;
	
	private double retiradaMaiorSalarioCc(double retirada,Long id){
		
		Salario salario = (Salario) salarioRepositorio.findOne(id);
		salario.setSalarioLiquido(salario.getSalarioLiquido() - retirada);
		
		return salario.getSalarioLiquido();
	}
}
