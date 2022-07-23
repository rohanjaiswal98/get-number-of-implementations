package com.spring.practice;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class RegularCustomer extends Customer {
    public RegularCustomer() {
        System.out.println("No-args constructor for RegularCustomer called");
    }
}
