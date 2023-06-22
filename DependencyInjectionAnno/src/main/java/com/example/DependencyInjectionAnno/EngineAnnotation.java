package com.example.DependencyInjectionAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.example.DependencyInjectionAnno")

public class EngineAnnotation {
	
	@Bean
	public Car getDrive() {
		return new Car();
	}
	
	@Bean
	public EngineInterface getEngine1(){
		return new Engine1();
	}
	
	@Bean
	public EngineInterface getEngine2() {
		return new Engine2();
	}

}
