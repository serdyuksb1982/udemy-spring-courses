package com.example.spring.lesson_1.database.rpool;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Component("pool1")
public class ConnectionPool /*implements InitializingBean*/ {
    private final String userName;
    private final Integer poolSize;
    /*private *//*final*//* List<Object> args;
    private Map<String, Object> properties;*/

    /*private ConnectionPool() {
    }*/

    public ConnectionPool(@Value("${db.username}") String userName,
                          @Value("${db.pool.size}") Integer poolSize) {
        this.userName = userName;
        this.poolSize = poolSize;
    }

    @PostConstruct
    private void init() {
        System.out.println("Init connection pool");
    }

    /*@Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set.");
    }*/

    @PreDestroy
    private void destroy() {
        System.out.println("Clean connection pool");
    }
}
