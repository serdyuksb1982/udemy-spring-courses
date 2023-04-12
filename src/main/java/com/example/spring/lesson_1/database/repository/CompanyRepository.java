package com.example.spring.lesson_1.database.repository;

import com.example.spring.lesson_1.bpp.Auditing;
import com.example.spring.lesson_1.bpp.InjectBean;
import com.example.spring.lesson_1.bpp.Transaction;
import com.example.spring.lesson_1.database.entity.Company;
import com.example.spring.lesson_1.database.rpool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Repository
@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {
    //@InjectBean
    //@Autowired
    //@Qualifier(value = "pool2")
    private final ConnectionPool connectionPool;

    private final List<ConnectionPool> pools;


    private final Integer poolSize;

    public CompanyRepository(ConnectionPool connectionPool,
                             List<ConnectionPool> pools,
                             @Value("${db.pool.size}")Integer poolSize) {
        this.connectionPool = connectionPool;
        this.pools = pools;
        this.poolSize = poolSize;
    }

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

}
