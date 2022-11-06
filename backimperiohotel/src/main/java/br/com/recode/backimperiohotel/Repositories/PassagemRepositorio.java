package br.com.recode.backimperiohotel.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.backimperiohotel.Models.Passagem;

@Repository
public interface PassagemRepositorio extends CrudRepository<Passagem, Long>{
    
}
