package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
    public static void main(String[] args) {
	System.out.println("object here created");
     ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	
    /* Person person=(Person)context.getBean("person2");
	 System.out.println(person);*/
     System.out.println("before get bean");
     Addition add =(Addition)context.getBean("add1");
     System.out.println("after get bean");
     add.sum();
    }
}
