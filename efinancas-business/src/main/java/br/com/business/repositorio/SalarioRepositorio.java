package br.com.business.repositorio;

import org.springframework.data.repository.CrudRepository;
import br.com.business.model.Salario;

public interface SalarioRepositorio extends CrudRepository<Salario, Long>  {

}
