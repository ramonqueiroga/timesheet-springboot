package br.com.timesheet.service;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ramon on 09/06/16.
 */
public abstract class AbstractService<T> implements IService<T> {

    private CrudRepository<T, Integer> repository;

    AbstractService(CrudRepository<T, Integer> repository) {
        this.repository = repository;
    }

    @Override
    public T findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public T save(T t) {
        return repository.save(t);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) repository.findAll();
    }
}
