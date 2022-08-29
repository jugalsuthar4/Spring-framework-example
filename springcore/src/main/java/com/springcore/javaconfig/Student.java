package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

// @Component
public class Student {
	
	private Address add;
	
    public void study() {
    	this.add.display();
    	System.out.println("student is reading book");
    }

	public Student(Address add) {
		super();
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [add=" + add + "]";
	}
    
    
}
