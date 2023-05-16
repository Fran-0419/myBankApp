package com.nunezo.bank.controllers;

import com.nunezo.bank.models.Account;
import com.nunezo.bank.models.User;
import com.nunezo.bank.models.data.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    //private List<Account> accounts = (List<Account>) accountRepository.findAll();
    int accountNumber;
    @GetMapping("generate_account")
    public String generateAccount(Model model){

        //if (accounts.isEmpty())
        if(accountRepository == null){
            accountNumber = (int) (Math.random() * Math.pow(10, 10));
            accountRepository.save(new Account(accountNumber));
        }else {
            try {
                do {
                    accountNumber = (int) (Math.random() * Math.pow(10, 10));
                } while (!accountRepository.containsAccountNum(accountNumber));
                accountRepository.save(new Account(accountNumber));
                //while(!accounts.contains(new Account((int) accountNumber)))
                accountRepository.save(new Account(accountNumber));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        model.addAttribute("account", accountRepository.findByAccountNumber(accountNumber) );
        model.addAttribute("title", "register" );
        model.addAttribute("user", new User());
        return "create_user_form";
    }

}
