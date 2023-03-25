package com.example.spring.lesson_1.database.repository;

import com.example.spring.lesson_1.database.rpool.ConnectionPool;

public class UserRepository {
    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
