package net.guilhermejr.casadocodigo.service;

import lombok.AllArgsConstructor;
import net.guilhermejr.casadocodigo.api.request.AutorRequest;
import net.guilhermejr.casadocodigo.api.response.AutorResponse;
import net.guilhermejr.casadocodigo.domain.entity.Autor;
import net.guilhermejr.casadocodigo.domain.repository.AutorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AutorService {

    private final AutorRepository autorRepository;

    @Transactional
    public AutorResponse inserir(AutorRequest autorRequest) {

        Autor autor = autorRepository.save(autorRequest.toEntity());

        return autor.toResponse();

    }

}
