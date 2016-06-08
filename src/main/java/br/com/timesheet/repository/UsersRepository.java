package br.com.timesheet.repository;

import br.com.timesheet.model.Users;
import org.springframework.data.repository.Repository;

/**
 * Created by ramon on 06/06/16.
 */
public interface UsersRepository extends Repository<Users, Integer> {
    Users findByUsername(String username);
    Users findOne(Integer id);
}
