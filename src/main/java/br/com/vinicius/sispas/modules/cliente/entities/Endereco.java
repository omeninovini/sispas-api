package br.com.vinicius.sispas.modules.cliente.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TbEndereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String rua;
    
    @Column
    private String bairro;
    
    @Column
    private String numero;
    
    @Column
    private String referencia;

    public Endereco(String rua, String bairro, String numero, String referencia) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.referencia = referencia;
    }
}
