package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feeStructure;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + "]";
	}
	
    
    
    
    
}
