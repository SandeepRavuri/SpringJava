package com.example.DependencyInjectionAnno;

import org.springframework.stereotype.Component;

@Component("Turbo")
public class Engine1 implements EngineInterface{

	@Override
	public void engineType() {
		// TODO Auto-generated method stub
		System.out.println("This is Turbo Engine");
	}

}
