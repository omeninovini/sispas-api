package br.com.vinicius.sispas.modules.cliente.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vinicius.sispas.modules.cliente.entities.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
    
    Optional<Telefone> findByNumero(String numero);
}
