package br.com.timesheet.security;

import br.com.timesheet.model.Account;
import br.com.timesheet.model.Role;
import br.com.timesheet.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ramon on 07/06/16.
 */
@Service
public class AccountUserDetailService implements UserDetailsService {

    @Autowired
    private AccountService service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = service.findByUsername(username);
        if(account == null) {
            //not found...
            return null;
        }
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Role role : account.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getCode()));
        }

        User userDetails = new User(account.getUsername(), account.getPassword(), account.isEnabled(),
                !account.isExpired(), !account.isCredentialexpired(), !account.isLocked(), grantedAuthorities);
        return userDetails;
    }
}
