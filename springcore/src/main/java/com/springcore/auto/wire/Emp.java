package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
     private Address address;

	public Address getAddress() {
		
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside param constructor");
	}
     
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

     
}
