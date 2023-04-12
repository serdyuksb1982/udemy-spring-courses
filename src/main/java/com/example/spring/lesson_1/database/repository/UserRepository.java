package com.example.spring.lesson_1.database.repository;

import com.example.spring.lesson_1.database.rpool.ConnectionPool;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
