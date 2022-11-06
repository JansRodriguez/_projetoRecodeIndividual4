package br.com.recode.backimperiohotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.backimperiohotel.Repositories.ClienteRepositorio;

@RestController
public class ClienteControle {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;
}
