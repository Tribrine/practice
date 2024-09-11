package com.tribrine.practice.beans;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student {
    private final Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student is printed");
        address.print();
    }

    public void init() {
        System.out.println("Student is initialized");
    }

    public void destroy() {
        System.out.println("Student is destroyed");
    }
}

class Address {
    public void print() {
        System.out.println("Address is printed");
    }
}

@Configuration
class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean(name = "studBean", initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student(address());
    }
}

public class BeanAnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Student student = (Student) context.getBean("studBean");
        student.print();

        context.close();
    }
}
