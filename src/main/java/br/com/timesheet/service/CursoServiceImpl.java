package br.com.timesheet.service;

import br.com.timesheet.model.Curso;
import br.com.timesheet.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository repository;

    @Override
    public Curso findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return repository.findAll();
    }
}
