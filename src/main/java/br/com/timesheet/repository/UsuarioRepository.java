package br.com.timesheet.repository;

import br.com.timesheet.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
@org.springframework.stereotype.Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findOne(Integer id);
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    Usuario findByNome(String nome);
}
