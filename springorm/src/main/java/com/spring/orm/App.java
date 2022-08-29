package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entties.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    	
    	
    	Student student=new Student(15,"Jugal Suthar","Mumbai");
    	int result=studentDao.insert(student);
    	System.out.println(result);
        System.out.println( "Hello World!" );
    }
}
