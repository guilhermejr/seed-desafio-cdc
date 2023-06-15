package net.guilhermejr.casadocodigo.api.request.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;
import net.guilhermejr.casadocodigo.api.request.validation.constrant.EmailUnico;
import net.guilhermejr.casadocodigo.domain.repository.AutorRepository;

@AllArgsConstructor
public class EmailUnicoValidation implements ConstraintValidator<EmailUnico, String> {

    private final AutorRepository autorRepository;

    @Override
    public void initialize(EmailUnico constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return !autorRepository.existsByEmail(email);
    }
}
