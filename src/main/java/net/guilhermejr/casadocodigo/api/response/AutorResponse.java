package net.guilhermejr.casadocodigo.api.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AutorResponse {

    private UUID id;
    private String nome;
    private String email;
    private String descricao;
    private String criado;

}
