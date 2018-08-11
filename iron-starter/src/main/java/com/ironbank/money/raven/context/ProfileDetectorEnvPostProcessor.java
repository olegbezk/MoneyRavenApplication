package com.ironbank.money.raven.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileDetectorEnvPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(final ConfigurableEnvironment environment, final SpringApplication application) {
        if (getTemperature() < -272) {
            environment.setActiveProfiles("Here");
        } else {
            environment.setActiveProfiles("Near");
        }
    }

    private int getTemperature() {
        return -300;
    }
}
