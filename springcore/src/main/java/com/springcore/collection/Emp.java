package com.springcore.collection;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Emp {
   
	private String name;
	private List<String> phones;
	private Set<String> city;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getCity() {
		return city;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, List<String> phones, Set<String> city, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.city = city;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
