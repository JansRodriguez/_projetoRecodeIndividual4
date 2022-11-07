package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Models.Cliente;
import br.com.recode.backimperiohotel.Repositories.ClienteRepositorio;

@RestController
@RequestMapping("/")
public class ClienteControle {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @PostMapping("/cliente")
    public Cliente cliente(@RequestBody Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }
}
