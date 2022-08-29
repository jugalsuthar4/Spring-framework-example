package com.springcore.ci;

import java.util.List;

public class Person {
     private String name;
     private int id;
     private Certi certi;
     private List<String> phone;
     
     
	public Person(String name, int id,Certi certi,List<String> phone) {
		super();
		this.name = name;
		this.id = id;
		this.certi=certi;
		this.phone=phone;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + ", phone=" + phone + "]";
	}

	

   
	
     
}
   