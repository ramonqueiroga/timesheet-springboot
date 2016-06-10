package br.com.timesheet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ramon on 09/06/16.
 */
public abstract class AbstractService<E, I extends Serializable, R extends CrudRepository<E, I>> implements IService<E> {

    @Autowired
    private R repository;

    @Override
    public E findOne(Integer id) {
        return repository.findOne((I)id);
    }

    @Override
    public E save(E e) {
        return repository.save(e);
    }

    @Override
    public List<E> findAll() {
        return (List<E>) repository.findAll();
    }

    public R getRepository() {
        return this.repository;
    }
}
