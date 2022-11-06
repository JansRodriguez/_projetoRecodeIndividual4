package br.com.recode.backimperiohotel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table()
@Getter
@Setter
public class Promocoes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSolicitacao;

    private String email;

    private String nome;

    private String destinoDesejado;
}
