package br.com.recode.backimperiohotel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contatos")
@Getter
@Setter
public class ContatoReclamacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContato;

    private String nome;

    private String email;

    private String texto;
}
