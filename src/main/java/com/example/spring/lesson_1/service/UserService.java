package com.example.spring.lesson_1.service;

import com.example.spring.lesson_1.database.entity.Company;
import com.example.spring.lesson_1.database.repository.CrudRepository;
import com.example.spring.lesson_1.database.repository.UserRepository;
import com.example.spring.lesson_1.database.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
