package com.example.spring.lesson_1;

import com.example.spring.lesson_1.database.repository.CompanyRepository;
import com.example.spring.lesson_1.database.rpool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        var context = new ClassPathXmlApplicationContext("application.xml");
        //Map<String, Object>
        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println((connectionPool));
        var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
        System.out.println(companyRepository);
    }
}
