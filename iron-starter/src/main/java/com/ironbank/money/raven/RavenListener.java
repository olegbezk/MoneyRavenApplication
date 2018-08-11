package com.ironbank.money.raven;

import com.ironbank.money.raven.properties.RavenProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    private final RavenProperties properties;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        properties.getWhere().forEach(destination -> System.out.println("Send raven...to: " + destination));
    }
}
