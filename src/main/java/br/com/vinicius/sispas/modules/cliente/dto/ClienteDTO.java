package br.com.vinicius.sispas.modules.cliente.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.vinicius.sispas.modules.cliente.entities.Cliente;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClienteDTO {
    
    private Long id;
    private String nome;
    private String bairro;
    private String rua;
    private String numero;
    private String referencia;
    private List<String> telefones;

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.bairro = cliente.getEndereco().getBairro();
        this.rua = cliente.getEndereco().getRua();
        this.numero = cliente.getEndereco().getNumero();
        this.referencia = cliente.getEndereco().getReferencia();
        this.telefones = cliente.getTelefones().stream().map(t -> (t.getNumero())).collect(Collectors.toList());
    }


    public static List<ClienteDTO> converter(List<Cliente> clientes) {
        return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }
}
