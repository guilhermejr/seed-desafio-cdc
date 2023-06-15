package net.guilhermejr.casadocodigo.domain.repository;

import net.guilhermejr.casadocodigo.domain.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
