package br.com.csgo.site.framework;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {

    List<T> findAll();

    Optional<T> findOne(ID id);

    T save(T entity);

    void delete(ID id);

}
