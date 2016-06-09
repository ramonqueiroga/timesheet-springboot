package br.com.timesheet.service;

import br.com.timesheet.model.Usuario;
import br.com.timesheet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Usuario findByNome(String nome) {
        return repository.findByNome(nome);
    }
}
