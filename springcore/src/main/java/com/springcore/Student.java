package com.springcore;

public class Student {
   private int id;
   private String studentName;
   private String studentAddress;
   
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getStudentName() {
	return studentName;
   }
   public void setStudentName(String studentName) {
	this.studentName = studentName;
   }
   public String getStudentAddress() {
	return studentAddress;
   }
   public void setStudentAddress(String studentAddress) {
	   this.studentAddress = studentAddress;
   }
   public Student(int id, String studentName, String studentAddress) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
   }
   public Student() {
	super();
	// TODO Auto-generated constructor stub
   }
@Override
public String toString() {
	return "Student [id=" + id + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
}
   
   
   
   
   
}
