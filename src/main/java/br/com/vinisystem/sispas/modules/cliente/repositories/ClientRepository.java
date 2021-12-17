package br.com.vinisystem.sispas.modules.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vinisystem.sispas.modules.cliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
