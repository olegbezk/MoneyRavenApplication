package com.ironbank.money.raven.service;

import java.util.List;

public interface TransferMoneyService {

    long transfer(String name, long amount);

    List<String> getBankCreditors(String... names);
}
