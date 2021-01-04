package io.github.alexmartinssi.service;

import io.github.alexmartinssi.model.Cliente;
import io.github.alexmartinssi.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
       this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplicar validações
    }
}
