package com.example.spring.lesson_1.database.repository;

import java.util.Optional;

public interface CrudRepository<K, E> {
    Optional<E> findById(K id);
    void delete(E entity);
}
