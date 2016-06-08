package br.com.timesheet.service;

import br.com.timesheet.model.Curso;
import br.com.timesheet.model.Produto;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
public interface CursoService {
    public Curso findOne(Integer id);
    public Curso save(Curso curso);
    public List<Curso> findAll();
}
