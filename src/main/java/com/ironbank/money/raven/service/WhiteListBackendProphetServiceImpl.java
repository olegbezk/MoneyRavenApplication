package com.ironbank.money.raven.service;

import com.ironbank.money.raven.constants.ProfileConstants;
import com.ironbank.money.raven.model.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(ProfileConstants.WINTER_IS_HERE)
@RequiredArgsConstructor
public class WhiteListBackendProphetServiceImpl implements ProphetService {

    private final ProphetProperties prophetProperties;

    @Override
    public boolean willSurvive(final String name) {
        return prophetProperties.getThose_who_returns_loans_back().contains(name);
    }
}
