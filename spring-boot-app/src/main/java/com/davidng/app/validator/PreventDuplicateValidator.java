package com.davidng.app.validator;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PreventDuplicateValidator {
    String[] includeFieldKeys() default {};

    String[] optionalValues() default {};

    long expireTime() default 10_000L;
}
