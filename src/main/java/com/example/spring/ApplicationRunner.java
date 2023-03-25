package com.example.spring;

import com.example.spring.database.repository.UserRepository;
import com.example.spring.database.rpool.ConnectionPool;
import com.example.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var userService = new UserService(userRepository);
        //TODO create code...
    }
}
