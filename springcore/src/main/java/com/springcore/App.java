package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/config.xml");
        Student obj= (Student)context.getBean("student1");
        Student obj1= (Student)context.getBean("student2");
        Student obj2= (Student)context.getBean("student3");
        System.out.println(obj2);
        
    }
}
