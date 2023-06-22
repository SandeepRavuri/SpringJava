package com.example.BeanLifeCycleSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifeCycleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLifeCycleSpringApplication.class, args);
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student stu = context.getBean("student",Student.class);
		
		System.out.println(stu);
		
		context.close();
	}

}
