package com.ironbank.money.raven;

import com.ironbank.money.raven.annotation.ConditionOnProduction;
import com.ironbank.money.raven.annotation.ConditionalOnRaven;
import com.ironbank.money.raven.properties.RavenProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

    @Bean
    @ConditionOnProduction
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    public RavenListener ravenListener(RavenProperties properties) {
        return new RavenListener(properties);
    }
}
