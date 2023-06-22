package com.example.BeanScopeSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication

public class BeanScopeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanScopeSpringApplication.class, args);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Student stu = (Student) context.getBean("student");
		stu.setStudentId(123);
		stu.setStudentName("sai");
		
		System.out.println("This is for stu");
		System.out.println(stu.getStudentId());
		System.out.println(stu.getStudentName());
		
		
		Student stu1 = (Student) context.getBean("student");
		System.out.println("This is for stu1");
		System.out.println(stu1.getStudentId());
		System.out.println(stu1.getStudentName());
		
	}

}
