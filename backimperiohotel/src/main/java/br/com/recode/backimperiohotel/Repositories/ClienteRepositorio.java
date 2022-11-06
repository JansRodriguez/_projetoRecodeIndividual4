package br.com.recode.backimperiohotel.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.backimperiohotel.Models.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Long>{
    
}
