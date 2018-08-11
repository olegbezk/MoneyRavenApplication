package com.ironbank.money.raven.service;

import com.ironbank.money.raven.constants.ProfileConstants;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile(ProfileConstants.WINTER_IS_NEAR)
public class NameBasedProphetServiceImpl implements ProphetService {

    @Override
    public boolean willSurvive(final String name) {
        return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
    }
}
