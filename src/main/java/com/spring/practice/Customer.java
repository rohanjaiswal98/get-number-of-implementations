package com.spring.practice;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
@SuppressWarnings("unused")
public class Customer implements Person {
    private String name;
    private int id;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Args constructor called.");
    }

    Customer() {
        System.out.println("No-args constructor called for Customer class.");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    void startUp() {
        System.out.println("Custom initializer called");
    }

    void destroy() {
        System.out.println("Custom destructor called");
    }

    //Destructor
}
