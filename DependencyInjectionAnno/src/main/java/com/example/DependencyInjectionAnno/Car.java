package com.example.DependencyInjectionAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("City")
	EngineInterface ef;
	
	
	public EngineInterface getEf() {
		return ef;
	}


	public void setEf(EngineInterface ef) {
		this.ef = ef;
	}


	public void show() {
		System.out.println("Iam driving a car with ");
		ef.engineType();
	}

}
