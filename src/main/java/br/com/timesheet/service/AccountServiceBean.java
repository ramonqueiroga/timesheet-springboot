package br.com.timesheet.service;

import br.com.timesheet.model.Account;
import br.com.timesheet.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ramon on 07/06/16.
 */
@Service
public class AccountServiceBean implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public Account findByUsername(String username) {
        Account account = repository.findByUsername(username);
        return account;
    }
}
