package br.com.timesheet.service;

import br.com.timesheet.model.Users;

/**
 * Created by ramon on 06/06/16.
 */
public interface UsersService {
    Users findByUsername(String username);
    Users findOne(Integer id);
}
