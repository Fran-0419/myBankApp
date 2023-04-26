package com.nunezo.bank.models.data;

import com.nunezo.bank.models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account,Integer> {

    @Query("SELECT t FROM Account t WHERE t.accountNum = ?1 ")
    boolean containsAccountNum(Integer accountNum);


    @Query("SELECT t FROM Account t WHERE t.accountNum = ?1 ")
    Account findByAccountNumber(Integer accountNum);
}

