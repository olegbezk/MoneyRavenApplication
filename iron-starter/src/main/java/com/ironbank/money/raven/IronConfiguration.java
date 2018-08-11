package com.ironbank.money.raven;

import com.ironbank.money.raven.annotation.ConditionOnProduction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IronConfiguration {

    @Bean
    @ConditionOnProduction
    public RavenListener ravenListener() {
        return new RavenListener();
    }
}
