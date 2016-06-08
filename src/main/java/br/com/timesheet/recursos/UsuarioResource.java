package br.com.timesheet.recursos;

import br.com.timesheet.model.Usuario;
import br.com.timesheet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ramon on 04/06/16.
 */
@RestController
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value="/api/usuarios/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findOne(@PathVariable("id") String id) {
        Integer identificador = Integer.valueOf(id);
        Usuario usuario = usuarioService.findOne(identificador);

        if(usuario == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @RequestMapping(value="/api/usuarios", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> usuarios = usuarioService.findAll();

        if(usuarios == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

}
