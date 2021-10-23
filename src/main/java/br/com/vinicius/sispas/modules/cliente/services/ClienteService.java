package br.com.vinicius.sispas.modules.cliente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.vinicius.sispas.modules.cliente.entities.Cliente;

public interface ClienteService {
    void salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
}
