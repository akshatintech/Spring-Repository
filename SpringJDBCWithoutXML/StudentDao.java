package com.spring.springjdbc.dao;

import java.util.List;

import com.spring.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	
	public Student 	getStudent(int student);
	
	public List<Student> getAllStudents();

}
