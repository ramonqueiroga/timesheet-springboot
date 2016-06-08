package br.com.timesheet.service;

import br.com.timesheet.model.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
public interface ProdutoService {
    public Produto findOne(Integer id);
    public Produto save(Produto produto);
    public List<Produto> findAll();
}
