package br.com.timesheet.service;

import br.com.timesheet.model.Usuario;

import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
public interface UsuarioService {
    Usuario findOne(Integer id);
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
}
