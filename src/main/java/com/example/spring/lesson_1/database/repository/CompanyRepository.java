package com.example.spring.lesson_1.database.repository;

import com.example.spring.lesson_1.database.rpool.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
