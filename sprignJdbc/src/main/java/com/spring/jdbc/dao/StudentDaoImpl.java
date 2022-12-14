package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.spring.jdbc.entities.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		 
		
		String query="insert into student(id,name,address) values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return r;
	}
     
	public int change(Student student) {
		
		String query="update student set name=?,address=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return r;
	}
	
	public int delete(Student student) {
		
		String query="Delete from student where id=?";
		int r=this.jdbcTemplate.update(query,student.getId());
		return r;
	}
	

	public Student getStudent(int studentId) {
		// selecting single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}
	
	
	public List<Student> getAllStudents() {
		String query="Select * from student";
		List<Student> students=this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

 
	
}
