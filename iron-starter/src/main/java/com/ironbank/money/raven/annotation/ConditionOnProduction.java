package com.ironbank.money.raven.annotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnConditionOnProduction.class)
public @interface ConditionOnProduction {

}
