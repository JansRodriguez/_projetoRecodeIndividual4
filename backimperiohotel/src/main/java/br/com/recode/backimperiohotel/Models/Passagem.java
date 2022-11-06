package br.com.recode.backimperiohotel.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "passagens")
@Getter
@Setter
public class Passagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPassagem;

    private Date dataViagem;

    private Date dataRetorno;

    private String LocalOrigem;

    private String LocalDestino;

    private double valor;
}
