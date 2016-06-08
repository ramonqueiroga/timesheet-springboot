package br.com.timesheet.repository;

import br.com.timesheet.model.Curso;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
@org.springframework.stereotype.Repository
public interface CursoRepository extends Repository<Curso, Integer> {
    public Curso findOne(Integer id);
    public Curso save(Curso curso);
    public List<Curso> findAll();
}
