package br.com.vinicius.sispas.modules.cliente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.vinicius.sispas.modules.cliente.entities.Cliente;
import br.com.vinicius.sispas.modules.cliente.exceptions.TelefoneExistsException;
import br.com.vinicius.sispas.modules.cliente.repositories.ClienteRepository;
import br.com.vinicius.sispas.modules.cliente.repositories.TelefoneRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final TelefoneRepository telefoneRepository;

    @Override
    public void salva(Cliente cliente) {
        cliente.getTelefones().stream().forEach( t -> {
            telefoneRepository.findByNumero(t.getNumero()).ifPresent(s -> {
                throw new TelefoneExistsException(t.getNumero());
            });
        });

        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        return clienteRepository.findAll();
    }
    
}
