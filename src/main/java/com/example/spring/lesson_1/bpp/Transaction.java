package com.example.spring.lesson_1.bpp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RetentionPolicy.Class,
 * RetentionPolicy.Runtime,
 * RetentionPolicy.Source
 * **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Transaction {
}
