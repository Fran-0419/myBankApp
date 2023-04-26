package com.nunezo.bank.controllers;

import com.nunezo.bank.models.Account;
import com.nunezo.bank.models.data.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    private List<Account> accounts = (List<Account>) accountRepository.findAll();

    @GetMapping("generateAccount")
    public String generateAccount(Model model){
        int accountNumber;
        do{
            accountNumber = (int) (Math.random()*Math.pow(10,10));
        }while(!accountRepository.containsAccountNum(accountNumber));
        //while(!accounts.contains(new Account((int) accountNumber)))

        model.addAttribute("account", new Account(accountNumber) );
        return "create_user_form";
    }

}
