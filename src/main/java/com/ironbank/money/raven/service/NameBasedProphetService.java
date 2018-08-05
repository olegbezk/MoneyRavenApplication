package com.ironbank.money.raven.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class NameBasedProphetService implements ProphetService {

    @Override
    public boolean willSurvive(final String name) {
        return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
    }
}
