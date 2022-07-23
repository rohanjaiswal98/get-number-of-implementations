package com.spring.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
             Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the fully qualified Class/Interface name: ");   // com.spring.practice.Person
            String classPath = sc.nextLine();
            System.out.println("Total number of implementations for " + classPath + " : " +
                    context.getBeanNamesForType(Class.forName(classPath)).length);
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid Classpath! Please try again.");
        }
    }
}
