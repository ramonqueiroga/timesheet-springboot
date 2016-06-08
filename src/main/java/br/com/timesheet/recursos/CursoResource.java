package br.com.timesheet.recursos;

import br.com.timesheet.model.Curso;
import br.com.timesheet.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
@RestController
public class CursoResource {

    @Autowired
    private CursoService cursoService;

    @RequestMapping(value="/api/cursos", method = RequestMethod.GET)
    public ResponseEntity<List<Curso>> findAll() {
        List<Curso> cursos = cursoService.findAll();
        if(cursos == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @RequestMapping(value="/api/cursos/{id}", method = RequestMethod.GET)
    public ResponseEntity<Curso> findOne(@PathVariable("id") String id) {
        Integer cursoId = new Integer(id);
        Curso curso = cursoService.findOne(cursoId);
        if(curso == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }

}
