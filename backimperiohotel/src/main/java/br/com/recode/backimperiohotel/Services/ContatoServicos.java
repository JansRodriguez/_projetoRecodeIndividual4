package br.com.recode.backimperiohotel.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.recode.backimperiohotel.Models.ContatoReclamacao;
import br.com.recode.backimperiohotel.Models.ContatoReclamacaoResposta;
import br.com.recode.backimperiohotel.Repositories.ContatoRepositorio;

@Service
public class ContatoServicos {
    
    @Autowired
    private ContatoRepositorio contatoRepositorio;

    @Autowired
    private ContatoReclamacaoResposta contatoReclamacaoResposta;

    //Método para cadastrar Contato de Reclamação
    public ResponseEntity<?> cadastrarContato(ContatoReclamacao contato){

        if (contato.getNome().equals("")) {
            contatoReclamacaoResposta.setMensagemContato("O nome do cliente precisa ser preenchido!");
            return new ResponseEntity<ContatoReclamacaoResposta>(contatoReclamacaoResposta, HttpStatus.BAD_REQUEST);
        }
        else if (contato.getEmail().equals("")) {
            contatoReclamacaoResposta.setMensagemContato("O email precisa ser preenchido!");
            return new ResponseEntity<ContatoReclamacaoResposta>(contatoReclamacaoResposta, HttpStatus.BAD_REQUEST);
        }
        else if (contato.getTexto().equals("")) {
            contatoReclamacaoResposta.setMensagemContato("Sua reclamação ou contato precisa ser preenhida!");
            return new ResponseEntity<ContatoReclamacaoResposta>(contatoReclamacaoResposta, HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<ContatoReclamacao>(contatoRepositorio.save(contato), HttpStatus.CREATED);
        }
    }

}
