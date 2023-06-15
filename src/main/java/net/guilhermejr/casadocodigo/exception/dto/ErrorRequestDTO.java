package net.guilhermejr.casadocodigo.exception.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorRequestDTO {

    private String campo;
    private String mensagem;

}
