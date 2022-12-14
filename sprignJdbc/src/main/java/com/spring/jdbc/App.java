package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
    	System.out.println("******JDBC CODE *****");
        
    	//ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	//fire the query
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    	/*Student student=new Student(66,"Saptarshi","Kolkatta");
    	
    	int result=studentDao.insert(student);
    	System.out.println("no of record inserted "+ result);*/
    	
    	
   // 	Student student =new Student(66,"Saptarshi","Bangalore");
    	
    	/*int result=studentDao.change(student);
    	System.out.println("no of record updated "+ result);*/
    	
   /* 	int result=studentDao.delete(student);
    	
    	System.out.println("no of student deleted "+result);*/
    	
    	
    	/*Student student= studentDao.getStudent(142);
    	System.out.println(student);*/
    	
    	List<Student> students=studentDao.getAllStudents();
    	
    	for(Student s:students) {
    		System.out.println(s);
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
 }
}
