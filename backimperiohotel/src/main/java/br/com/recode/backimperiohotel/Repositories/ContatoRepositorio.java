package br.com.recode.backimperiohotel.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.backimperiohotel.Models.ContatoReclamacao;

@Repository
public interface ContatoRepositorio extends CrudRepository<ContatoReclamacao, Long> {
    
}
