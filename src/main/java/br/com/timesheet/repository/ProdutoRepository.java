package br.com.timesheet.repository;

import br.com.timesheet.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by ramon on 30/05/16.
 */
@org.springframework.stereotype.Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    public Produto findOne(Integer id);

    public Produto save(Produto produto);

    public List<Produto> findAll();

}
