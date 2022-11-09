package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Models.Cliente;
import br.com.recode.backimperiohotel.Services.ClienteServicos;

@RestController
public class ClienteControle {

    @Autowired
    private ClienteServicos clienteServicos;

    @PostMapping("/cliente")
    public ResponseEntity<?> cadastrar(@RequestBody Cliente cliente){
        return clienteServicos.cadastrarAlterarCliente(cliente, "cadastrar");
    }   

    @PutMapping("/cliente")
    public ResponseEntity<?> alterar(@RequestBody Cliente cliente){
        return clienteServicos.cadastrarAlterarCliente(cliente, "alterar");
    } 


}
