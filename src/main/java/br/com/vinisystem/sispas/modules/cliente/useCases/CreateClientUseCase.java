package br.com.vinisystem.sispas.modules.cliente.useCases;

import br.com.vinisystem.sispas.modules.cliente.entities.Client;
import br.com.vinisystem.sispas.modules.cliente.entities.Phone;
import br.com.vinisystem.sispas.modules.cliente.exceptions.PhoneExistsException;
import br.com.vinisystem.sispas.modules.cliente.repositories.ClientRepository;
import br.com.vinisystem.sispas.modules.cliente.repositories.TelefoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreateClientUseCase {

    private final ClientRepository clienteRepository;
    private final TelefoneRepository telefoneRepository;

    public void execute(Client client) {
        checkExistsClientWithPhone(client.getPhones());
        clienteRepository.save(client);
    }

    private void checkExistsClientWithPhone(List<Phone> phones) {
        phones.stream().forEach( phone -> {
            telefoneRepository.findByNumero(phone.getNumber()).ifPresent(s -> {
                throw new PhoneExistsException(phone.getNumber());
            });
        });
    }
}
