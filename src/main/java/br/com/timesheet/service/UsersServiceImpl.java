package br.com.timesheet.service;

import br.com.timesheet.model.Users;
import br.com.timesheet.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ramon on 06/06/16.
 */
@Service("usersServiceImpl")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository repository;

    @Override
    public Users findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Users findOne(Integer id) {
        return repository.findOne(id);
    }
}
