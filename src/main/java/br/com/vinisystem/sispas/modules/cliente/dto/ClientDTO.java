package br.com.vinisystem.sispas.modules.cliente.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.vinisystem.sispas.modules.cliente.entities.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClientDTO {
    
    private Long id;
    private String name;
    private String district;
    private String street;
    private String number;
    private String reference;
    private List<String> phones;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.district = client.getAddress().getDistrict();
        this.street = client.getAddress().getStreet();
        this.number = client.getAddress().getNumber();
        this.reference = client.getAddress().getReference();
        this.phones = client.getPhones().stream().map(phone -> (phone.getNumber())).collect(Collectors.toList());
    }


    public static List<ClientDTO> converter(List<Client> clients) {
        return clients.stream().map(ClientDTO::new).collect(Collectors.toList());
    }
}
