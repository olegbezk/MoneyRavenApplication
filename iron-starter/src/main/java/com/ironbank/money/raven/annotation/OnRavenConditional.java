package com.ironbank.money.raven.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnRavenConditional extends AllNestedConditions {

    public OnRavenConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty("raven.where")
    public static class RavenWhere {

    }

    @ConditionalOnProperty(value = "raven.enabled", havingValue = "true")
    public static class RavenEnabled {

    }
}
