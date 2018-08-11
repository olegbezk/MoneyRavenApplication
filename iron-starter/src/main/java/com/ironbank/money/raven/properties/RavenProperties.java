package com.ironbank.money.raven.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "raven")
@Getter
@Setter
public class RavenProperties {

    /**
     * Destinations, where raven should fly
     */
    private List<String> where;

    /**
     * Enable or disable raven
     */
    private boolean enabled;
}
