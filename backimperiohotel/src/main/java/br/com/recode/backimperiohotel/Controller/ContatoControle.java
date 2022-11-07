package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Models.ContatoReclamacao;
import br.com.recode.backimperiohotel.Repositories.ContatoRepositorio;

@RestController
@RequestMapping("/")
public class ContatoControle {

    @Autowired
    private ContatoRepositorio contatoRepositorio;

    @PostMapping("/contato")
    public ContatoReclamacao contato(@RequestBody ContatoReclamacao contato){
        return contatoRepositorio.save(contato);
    }


    
}
