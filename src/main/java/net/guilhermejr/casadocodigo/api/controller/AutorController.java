package net.guilhermejr.casadocodigo.api.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.guilhermejr.casadocodigo.api.request.AutorRequest;
import net.guilhermejr.casadocodigo.api.response.AutorResponse;
import net.guilhermejr.casadocodigo.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutorController {

    private final AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorResponse> inserir(@Valid @RequestBody AutorRequest autorRequest) {

        AutorResponse autorResponse = autorService.inserir(autorRequest);

        return ResponseEntity.status(HttpStatus.OK).body(autorResponse);

    }

}
