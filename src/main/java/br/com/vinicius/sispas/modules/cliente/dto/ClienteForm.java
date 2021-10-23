package br.com.vinicius.sispas.modules.cliente.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.vinicius.sispas.modules.cliente.entities.Cliente;
import br.com.vinicius.sispas.modules.cliente.entities.Endereco;
import br.com.vinicius.sispas.modules.cliente.entities.Telefone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteForm {
    
    private String nome;
    private String bairro;
    private String rua;
    private String numero;
    private String referencia;
    private List<String> telefones;


    public static Cliente converter (ClienteForm clienteForm) {
        Endereco endereco = new Endereco(clienteForm.rua, clienteForm.bairro, clienteForm.numero, clienteForm.referencia);
        Cliente clienteNovo = new Cliente(clienteForm.nome, endereco);
        List<Telefone> telefones = clienteForm.telefones.stream().map(t -> (new Telefone(t, clienteNovo))).collect(Collectors.toList());
        clienteNovo.setTelefones(telefones);
        
        return clienteNovo;
    }
}
