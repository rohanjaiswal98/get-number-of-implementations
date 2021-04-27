package com.spring.practice;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Student() {
        System.out.println("No-args constructor for Student Class");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
