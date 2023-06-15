package net.guilhermejr.casadocodigo.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import net.guilhermejr.casadocodigo.api.response.AutorResponse;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autores")
public class Autor implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(columnDefinition = "text", nullable = false)
    private String descricao;

    @Column(updatable = false)
    private LocalDateTime criado;

    public AutorResponse toResponse() {

        return AutorResponse
                .builder()
                .id(id)
                .nome(nome)
                .email(email)
                .descricao(descricao)
                .criado(criado.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")))
                .build();

    }

}
