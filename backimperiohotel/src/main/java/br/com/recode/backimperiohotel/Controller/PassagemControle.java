package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Repositories.PassagemRepositorio;

@RestController
public class PassagemControle {

    @Autowired
    private PassagemRepositorio passagemRepositorio;
    
}
