package com.dio.flashcards.core.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = (MongoIdValidator.class))
public @interface MongoId {

    String message() default "br.com.dio.reactive.flash-cards.mongo.Id.message";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default { };
}
