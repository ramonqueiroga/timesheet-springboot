package br.com.timesheet.repository;

import br.com.timesheet.model.Usuario;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
@org.springframework.stereotype.Repository
public interface UsuarioRepository extends Repository<Usuario, Integer> {
    public Usuario findOne(Integer id);
    public Usuario save(Usuario usuario);
    public List<Usuario> findAll();
}
