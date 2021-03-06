package com.ironbank.money.raven.controller;

import com.ironbank.money.raven.dao.MoneyDao;
import com.ironbank.money.raven.model.Bank;
import com.ironbank.money.raven.service.TransferMoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class IronBankController {

    private final TransferMoneyService transferMoneyService;

    private final MoneyDao moneyDao;

    @GetMapping("/credit")
    public String credit(@RequestParam String name, @RequestParam long amount) {
        final long transfer = transferMoneyService.transfer(name, amount);
        if (transfer == -1) {
            return "Redirect <br/>" + name + " <b>will not</b> survive this winter";
        }
        return MessageFormat.format("<i>Credit approved for {0}</i> <br/> Current credit in bank: <b>{1}</b>",
                name,
                amount
        );
    }

    @GetMapping("/state")
    public long currentState() {
        return moneyDao.findAll().get(0).getAmount();
    }

    @GetMapping("/creditors/{names}") // http://localhost:8080/creditors/<name_1>,<name_2>,...
    public List<Bank> creditors(@PathVariable String[] names) {
        return transferMoneyService.getBankCreditors(names);
    }

    @GetMapping("/creditors")
    public List<Bank> getCreditors(@RequestParam(value = "name") String... names) {
        return transferMoneyService.getBankCreditors(names);
    }
}
