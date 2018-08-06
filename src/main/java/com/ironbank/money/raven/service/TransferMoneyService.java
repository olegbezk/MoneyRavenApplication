package com.ironbank.money.raven.service;

import com.ironbank.money.raven.model.Bank;

import java.util.List;

public interface TransferMoneyService {

    long transfer(String name, long amount);

    List<Bank> getBankCreditors(String... names);
}
