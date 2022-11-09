package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Models.ContatoReclamacao;
import br.com.recode.backimperiohotel.Services.ContatoServicos;

@RestController
@RequestMapping("/")
public class ContatoControle {

    @Autowired
    private ContatoServicos contatoServicos;

    @PostMapping("/contato")
    public ResponseEntity<?> cadastrar(@RequestBody ContatoReclamacao contato) {
        return contatoServicos.cadastrarAlterarContato(contato, "cadastrar");
    }

    @PutMapping("/contato")
    public ResponseEntity<?> alterar(@RequestBody ContatoReclamacao contato) {
        return contatoServicos.cadastrarAlterarContato(contato, "alterar");
    }

}
