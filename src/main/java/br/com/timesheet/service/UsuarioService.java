package br.com.timesheet.service;

import br.com.timesheet.model.Produto;
import br.com.timesheet.model.Usuario;
import br.com.timesheet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
@Service("usuarioService")
public class UsuarioService extends AbstractService<Usuario> {

    private UsuarioRepository repository;

    @Autowired
    UsuarioService(UsuarioRepository repository) {
        super(repository);
        this.repository= repository;
    }

    public Usuario findByNome(String nome) {
        return repository.findByNome(nome);
    }
}
