package br.com.recode.backimperiohotel.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nome;

    private String cpf;

    private String email;

    @OneToMany
    @JoinColumn(name = "codigo_reclamacao")
    private List<ContatoReclamacao> contato;

    @OneToMany
    @JoinColumn(name = "codigo_passagens")
    private List<Passagem> passagens;

    @OneToMany
    @JoinColumn(name = "codigo_promocoes")
    private List<Promocoes> promocoes;

}
