package com.example.spring.lesson_1.database.repository;

import com.example.spring.lesson_1.bpp.InjectBean;
import com.example.spring.lesson_1.database.rpool.ConnectionPool;

public class CompanyRepository {
    @InjectBean
    private ConnectionPool connectionPool;

    /*public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static CompanyRepository of(ConnectionPool connectionPool) {
        return new CompanyRepository(connectionPool);
    }*/
}
