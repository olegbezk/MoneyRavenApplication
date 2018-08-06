package com.ironbank.money.raven.dao;

import com.ironbank.money.raven.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyDao extends JpaRepository<Bank, String> {

    Bank findByName(String name);
}
