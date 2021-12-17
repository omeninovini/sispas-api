package br.com.vinisystem.sispas.modules.cliente.resources;

import java.util.List;

import br.com.vinisystem.sispas.modules.cliente.useCases.CreateClientUseCase;
import br.com.vinisystem.sispas.modules.cliente.useCases.FindAllClientUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinisystem.sispas.modules.cliente.dto.ClientDTO;
import br.com.vinisystem.sispas.modules.cliente.dto.ClientForm;

@RestController
@RequestMapping("/clientes")
public class ClientResource {
    
    @Autowired private CreateClientUseCase createClientUseCase;
    @Autowired private FindAllClientUseCase findAllClientUseCase;

    @PostMapping
    public void createClient(@RequestBody ClientForm clienteForm) {
        createClientUseCase.execute(ClientForm.converter(clienteForm));
    }

    @GetMapping
    public List<ClientDTO> findAllClients() {
        return ClientDTO.converter(findAllClientUseCase.execute());
    }
}
