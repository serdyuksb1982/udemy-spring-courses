package com.example.spring.lesson_1.database.repository;

import com.example.spring.lesson_1.bpp.Auditing;
import com.example.spring.lesson_1.bpp.InjectBean;
import com.example.spring.lesson_1.bpp.Transaction;
import com.example.spring.lesson_1.database.entity.Company;
import com.example.spring.lesson_1.database.rpool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;
@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {
    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("Init company repository...");
    }

    @Override
    public Optional<Company> findById(Integer id) {

        System.out.println("Find by id...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete entity...");
    }

    /*public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static CompanyRepository of(ConnectionPool connectionPool) {
        return new CompanyRepository(connectionPool);
    }*/
}
