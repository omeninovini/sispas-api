package br.com.vinisystem.sispas.modules.cliente.entities;

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
@ToString
@Entity
@Table(name = "TBAddresses")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;
    
    @Column
    private String district;
    
    @Column
    private String number;
    
    @Column
    private String reference;

    public Address(String street, String district, String number, String reference) {
        this.street = street;
        this.district = district;
        this.number = number;
        this.reference = reference;
    }
}
