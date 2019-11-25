package com.buratti;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private Soul soul;
	
	Person(){};
	
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.soul = new Soul();
	}
	
	@Override
	public String toString() {
		return  "Name: " + name + 
				"\nAge: " + age +
				"\nGender: " + gender +
				"\nSoul:" + soul.toString()+
				"\n";
	}
	
}
