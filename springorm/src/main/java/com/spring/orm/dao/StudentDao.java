package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entties.Student;

public class StudentDao {
   
	private HibernateTemplate hibernateTemplate;
	
	public int insert(Student student) {
		int result=(Integer) this.hibernateTemplate.save(student);
		return result;
	}
}  
