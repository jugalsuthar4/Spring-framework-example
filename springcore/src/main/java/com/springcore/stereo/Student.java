package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
     @Value("Jay Shah")
	 private String name;
     @Value("Delhi")
	 private String city;
     
     @Value("#{temp}")
     private List<String> address;
     
     
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	
	 
}
