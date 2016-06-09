package br.com.timesheet.security;

import br.com.timesheet.model.Regra;
import br.com.timesheet.model.Usuario;
import br.com.timesheet.service.UsuarioService;
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
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByNome(nome);
        if(usuario == null) {
            return null;
        }
        Collection<GrantedAuthority> grantedAuthorities = getGrantedAuthorities(usuario);
        User userDetails = getUserDetails(usuario, grantedAuthorities);
        return userDetails;
    }

    private User getUserDetails(Usuario usuario, Collection<GrantedAuthority> grantedAuthorities) {
        return new User(usuario.getNome(), usuario.getSenha(), usuario.isHabilitado(),
                    !usuario.isExpirado(), !usuario.isCredencialExpirada(), !usuario.isBloqueado(), grantedAuthorities);
    }

    private Collection<GrantedAuthority> getGrantedAuthorities(Usuario usuario) {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Regra regra : usuario.getRegras()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(regra.getNome()));
        }
        return grantedAuthorities;
    }
}
