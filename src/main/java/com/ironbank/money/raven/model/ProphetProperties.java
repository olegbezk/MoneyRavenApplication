package com.ironbank.money.raven.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "iron-bank")
@Getter
@Setter
public class ProphetProperties {

    /**
     * Those who give loans back.
     */
    private String those_who_give_loans_back;
}
