package br.com.recode.backimperiohotel.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contatos")
@Getter
@Setter
public class ContatoReclamacao {
    
    private Long idContato;

    private String nome;

    private String email;

    private String texto;
}
