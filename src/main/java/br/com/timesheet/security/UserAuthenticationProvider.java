package br.com.timesheet.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Created by ramon on 07/06/16.
 */
@Component
public class UserAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken token)
            throws AuthenticationException {
        if(token.getCredentials() == null || userDetails.getPassword() == null)
            throw new BadCredentialsException("Credenciais não podem ser nulas.");

        if(!passwordEncoder.matches((String) token.getCredentials(), userDetails.getPassword()))
            throw new BadCredentialsException("Credenciais inválidas");
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken token)
            throws AuthenticationException {
        UserDetails userDetails = userDetailService.loadUserByUsername(username);
        return userDetails;
    }
}
