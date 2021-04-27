package com.spring.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class MyApp {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fully qualified Class/Interface name: ");   // com.spring.practice.Person
        String classPath = sc.nextLine();
        sc.close();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        try {
            System.out.println("Total number of implementations for " + classPath + " : " +
                    context.getBeanNamesForType(Class.forName(classPath)).length);
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid Classpath!");
        }
        finally {
            context.close();
        }

    }
}
