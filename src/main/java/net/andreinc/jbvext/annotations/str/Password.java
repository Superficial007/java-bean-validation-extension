package net.andreinc.jbvext.annotations.str;

import net.andreinc.jbvext.annotations.str.validators.ParseableValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = ParseableValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface Password {

    boolean containsUpperCase() default true;

    boolean containsLowerCase() default true;

    boolean containsSpecialChar() default true;

    boolean containsDigits() default true;

    int minSize() default 8;

    int maxSize() default 32;

    String message() default "{string.parseable}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}