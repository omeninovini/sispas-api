package br.com.vinicius.sispas.modules.cliente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicius.sispas.modules.cliente.dto.ClienteDTO;
import br.com.vinicius.sispas.modules.cliente.dto.ClienteForm;
import br.com.vinicius.sispas.modules.cliente.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void criaCliente(@RequestBody ClienteForm clienteForm) {
        clienteService.salva(ClienteForm.converter(clienteForm));
    }

    @GetMapping
    public List<ClienteDTO> buscaTodosClientes() {
        return ClienteDTO.converter(clienteService.buscaTodosClientes());
    }
}
