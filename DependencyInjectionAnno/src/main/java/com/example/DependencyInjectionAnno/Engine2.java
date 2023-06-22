package com.example.DependencyInjectionAnno;

import org.springframework.stereotype.Component;

@Component("City")
public class Engine2 implements EngineInterface {

	@Override
	public void engineType() {
		// TODO Auto-generated method stub
		System.out.println("This is City Engine");
		
	}

}
