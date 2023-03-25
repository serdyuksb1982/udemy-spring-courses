package com.example.spring.lesson_1.ioc;
/**
 * Dependency Injection
 * фреймворк определяет и внедряет
 * зависимости объекта через:
 *
 * - параметры констуктора
 * - параметры статического метода инициализации (фабричный метод)
 * - свойства объекта (set-methods)
 * **/

public class Container {
    public <T> T get(Class<T> clazz) {
        return (T) clazz;
    }
}
