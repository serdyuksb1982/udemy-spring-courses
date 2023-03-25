package com.example.spring.database.repository;

import com.example.spring.database.rpool.ConnectionPool;

public class UserRepository {
    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
