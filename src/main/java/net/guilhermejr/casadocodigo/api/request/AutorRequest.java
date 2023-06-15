package net.guilhermejr.casadocodigo.api.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import net.guilhermejr.casadocodigo.api.request.validation.constrant.EmailUnico;
import net.guilhermejr.casadocodigo.domain.entity.Autor;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AutorRequest {

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    @EmailUnico
    private String email;

    @NotBlank
    @Size(max = 200)
    private String descricao;

    public Autor toEntity() {

        return Autor
                .builder()
                .nome(nome)
                .email(email)
                .descricao(descricao)
                .criado(LocalDateTime.now())
                .build();

    }

}
