package br.com.timesheet.service;

import br.com.timesheet.model.Account;

/**
 * Created by ramon on 07/06/16.
 */
public interface AccountService {
    Account findByUsername(String username);
}
