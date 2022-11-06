package br.com.recode.backimperiohotel.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.backimperiohotel.Models.Promocoes;

@Repository
public interface PromocoesRepositorio extends CrudRepository<Promocoes, Long>{
    
}
