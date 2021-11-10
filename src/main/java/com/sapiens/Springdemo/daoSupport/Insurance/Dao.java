package com.sapiens.Springdemo.daoSupport.Insurance;

import java.util.List;

public interface Dao<T> {
    void save(T t);
    T load(int id);
    void delete(int id);
    void update(T t);
    List<T> loadAll();
}
