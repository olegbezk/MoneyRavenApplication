package com.ironbank.money.raven.service;

import com.ironbank.money.raven.dao.MoneyDao;
import com.ironbank.money.raven.model.Bank;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferMoneyServiceImpl implements TransferMoneyService {

    private final MoneyDao moneyDao;

    private final ProphetService prophetService;

    @Override
    public long transfer(final String name, final long amount) {
        if (!prophetService.willSurvive(name)) {
            return -1;
        }

        final Bank bank = new Bank();
        bank.setName(name);
        bank.setAmount(amount);
        moneyDao.save(bank);

        return 0;
    }
}
