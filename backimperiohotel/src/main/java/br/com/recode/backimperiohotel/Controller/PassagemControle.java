package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Models.Passagem;
import br.com.recode.backimperiohotel.Repositories.PassagemRepositorio;

@RestController
@RequestMapping("/")
public class PassagemControle {

    @Autowired
    private PassagemRepositorio passagemRepositorio;

    @PostMapping("/passagem")
    public Passagem passagem(@RequestBody Passagem passagem) {
        return passagemRepositorio.save(passagem);
    }

}
