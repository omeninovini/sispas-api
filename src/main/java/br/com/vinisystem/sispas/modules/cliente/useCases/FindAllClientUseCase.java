package br.com.vinisystem.sispas.modules.cliente.useCases;

import br.com.vinisystem.sispas.modules.cliente.entities.Client;
import br.com.vinisystem.sispas.modules.cliente.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllClientUseCase {

    private final ClientRepository clientRepository;

    public List<Client> execute() {
        return clientRepository.findAll();
    }
}
