package com.h2kinfosys.java.accessModifiers.employee;

import com.h2kinfosys.java.accessModifiers.person.Person;

public class Employee extends Person{
	public Employee(String name, int age , int ssn) {
		super(name, age , ssn);
		this.id = 10;
	}
	
	public void printBehaviour(){
		System.out.println(id);
	}
}