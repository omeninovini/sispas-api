package br.com.vinisystem.sispas.modules.cliente.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vinisystem.sispas.modules.cliente.entities.Phone;

@Repository
public interface TelefoneRepository extends JpaRepository<Phone, Long> {
    
    Optional<Phone> findByNumero(String numero);
}
