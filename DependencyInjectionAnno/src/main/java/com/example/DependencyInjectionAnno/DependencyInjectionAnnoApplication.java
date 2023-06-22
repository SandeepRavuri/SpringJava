package com.example.DependencyInjectionAnno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= "com.example.DependencyInjectionAnno")
public class DependencyInjectionAnnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionAnnoApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EngineAnnotation.class);
		
		
		Car car = context.getBean(Car.class);
		car.show();		
		
		
	}

}
