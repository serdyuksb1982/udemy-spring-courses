package com.example.spring;

import com.example.spring.database.repository.CompanyRepository;
import com.example.spring.database.repository.UserRepository;
import com.example.spring.database.rpool.ConnectionPool;
import com.example.spring.service.UserService;
/**
 * Inversion of Control
 * (IoC - инверсия управления)
 * это принцип программирования, при котором управление программы передается фреймворку, а не программисту.
 *
 * Dependency Injection
 * (DI - внедрение зависимостей)
 * это одна из реализаций иверсии управления (IoC), посредством которой созданием объекта и компоновкой его
 * зависимостей занимается другой объект (фреймворк).
 * **/
public class ApplicationRunner {
    public static void main(String[] args) {
        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var companyRepository = new CompanyRepository(connectionPool);
        var userService = new UserService(userRepository, companyRepository);
        //TODO create code...
    }
}
