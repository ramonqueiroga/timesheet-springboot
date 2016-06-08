package br.com.timesheet.service;

import br.com.timesheet.model.Produto;
import br.com.timesheet.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
@Service("produtoServiceImpl")
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Override
    public Produto findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Produto save(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public List<Produto> findAll() {
        return repository.findAll();
    }
}
