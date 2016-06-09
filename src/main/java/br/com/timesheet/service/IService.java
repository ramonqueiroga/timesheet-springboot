package br.com.timesheet.service;

import java.util.List;

/**
 * Created by ramon on 09/06/16.
 */
public interface IService<T> {
    T findOne(Integer id);
    T save(T produto);
    List<T> findAll();
}
