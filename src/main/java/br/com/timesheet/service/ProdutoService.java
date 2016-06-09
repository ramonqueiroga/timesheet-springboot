package br.com.timesheet.service;

import br.com.timesheet.model.Produto;
import br.com.timesheet.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ramon on 30/05/16.
 */
@Service("produtoService")
public class ProdutoService extends AbstractService<Produto> {

    @Autowired
    ProdutoService(ProdutoRepository repository) {
        super(repository);
    }

}
