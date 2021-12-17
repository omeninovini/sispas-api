package br.com.vinisystem.sispas.modules.cliente.dto;

import java.util.List;

import br.com.vinisystem.sispas.modules.cliente.entities.Client;
import br.com.vinisystem.sispas.modules.cliente.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {
    
    private String name;
    private String district;
    private String street;
    private String number;
    private String reference;
    private List<String> phones;


    public static Client converter (ClientForm clienteForm) {
        Address address = new Address(clienteForm.getStreet(), clienteForm.getDistrict(), clienteForm.getNumber(), clienteForm.getReference());
        Client newClient = new Client(clienteForm.getName(), address, clienteForm.getPhones());
        return newClient;
    }
}
