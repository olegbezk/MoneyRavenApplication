package com.ironbank.money.raven.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "iron-bank")
@Getter
@Setter
public class ProphetProperties {

    /**
     * Those who returns loans back.
     */
    private String those_who_returns_loans_back;
}
