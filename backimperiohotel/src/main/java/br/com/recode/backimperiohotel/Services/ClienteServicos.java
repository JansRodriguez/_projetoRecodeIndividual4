package br.com.recode.backimperiohotel.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.recode.backimperiohotel.Models.Cliente;
import br.com.recode.backimperiohotel.Models.ClienteResposta;
import br.com.recode.backimperiohotel.Repositories.ClienteRepositorio;

@Service
public class ClienteServicos {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private ClienteResposta clienteResposta;

    //Método para cadastrar clientes
    //Nesse método poderá ser retornado tanto uma Classe Cliente como ClienteResposta.
    //Esse método é responsável por solicitar as informações completas da tabela.
    //Aqui tem obrigatóriedade do preenchimento dos campos nas tabelas
    public ResponseEntity<?> cadastrarAlterarCliente(Cliente cliente, String acao){

        if(cliente.getNome().equals("")){
            clienteResposta.setMensagemCliente("O nome do cliente precisa ser preenchido!");
            return new ResponseEntity<ClienteResposta>(clienteResposta, HttpStatus.BAD_REQUEST);
        }
        else if(cliente.getCpf().equals("")){
            clienteResposta.setMensagemCliente("O cpf do cliente precisa ser preenchido");
            return new ResponseEntity<ClienteResposta>(clienteResposta, HttpStatus.BAD_REQUEST);
        }
        else if(cliente.getEmail().equals("")){
            clienteResposta.setMensagemCliente("O e-mail do cliente precisa ser preenchido");
            return new ResponseEntity<ClienteResposta>(clienteResposta, HttpStatus.BAD_REQUEST);
        }
        else{
            if (acao.equals("cadastrar")) {
                return new ResponseEntity<Cliente>(clienteRepositorio.save(cliente), HttpStatus.CREATED);
            }
            else{
                return new ResponseEntity<Cliente>(clienteRepositorio.save(cliente), HttpStatus.OK);
            }
        }
    }

    /* - Aqui não tem obrigatoridade de preenchimento dos campos nas tabelas 
    public Cliente cliente(@RequestBody Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }*/
} 
