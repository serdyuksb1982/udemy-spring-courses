package com.example.spring.lesson_1.config;

import com.example.spring.lesson_1.database.repository.CrudRepository;
import com.example.web.config.WebConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@ImportResource("classpath:application.xml")
@Import(WebConfiguration.class)
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.example.spring",
    useDefaultFilters = false,
    includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,
        value = Component.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
        value = CrudRepository.class),
        @ComponentScan.Filter(type = FilterType.REGEX,
        pattern = "com\\..+Repository")
    })
public class ApplicationConfiguration {


}
