package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Models.Promocoes;
import br.com.recode.backimperiohotel.Repositories.PromocoesRepositorio;

@RestController
@RequestMapping("/")
public class PromocoesControle {

    @Autowired
    private PromocoesRepositorio promocoesRepositorio;

    @PostMapping("/promocoes")
    public Promocoes promocoes(@RequestBody Promocoes promocoes) {
        return promocoesRepositorio.save(promocoes);
    }
}
