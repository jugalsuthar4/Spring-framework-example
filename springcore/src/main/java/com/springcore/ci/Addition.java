package com.springcore.ci;

public class Addition {
    private int a;
    private int b;
    
    public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b =(int)b;
		System.out.println("addition double,double constructor");
	}
    
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("addition int ,int constructor");
	}
	
	public Addition(String a, String b) {
		super();
		System.out.println("object created");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		this.a = Integer.parseInt(b);
		this.b = Integer.parseInt(b);
		System.out.println("addition STR ,STR constructor");
	}
	
	
	
	
	public void sum() {
		System.out.println("sum is "+" :" + (a+b));
	}
	
	
    
    
}
