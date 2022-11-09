package br.com.recode.backimperiohotel.Models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
//Anotação para inserir a injeção de dependencias na classe.
//Fica por conta do Spring a criação do objeto relacionado aquela classe.
//Não precisamos instanciar o objeto do tipo ClienteResposta.
@Getter
@Setter
public class PromocoesResposta {
    //Classe criada para devolver uma resposta da API de uma requisição quando tiver um problema na solicitação. Tipo de requisições {Inserir, Atualizar, Selecionar, Deletar}
    private String mensagemPromocoes;
}
