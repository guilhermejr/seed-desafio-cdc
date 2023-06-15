package net.guilhermejr.casadocodigo.api.request.validation.constrant;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import net.guilhermejr.casadocodigo.api.request.validation.EmailUnicoValidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmailUnicoValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailUnico {

    String message() default "E-mail já está cadastrado.";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}
