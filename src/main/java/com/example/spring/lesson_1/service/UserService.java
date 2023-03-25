package com.example.spring.lesson_1.service;

import com.example.spring.lesson_1.database.repository.UserRepository;
import com.example.spring.lesson_1.database.repository.CompanyRepository;

public class UserService {
    private final UserRepository userRepository;

    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
