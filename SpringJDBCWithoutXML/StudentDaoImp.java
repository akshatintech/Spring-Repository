package com.spring.springjdbc.dao;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.springjdbc.entities.Student;


public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
//insert squery
        
		
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query, student.getId() , student.getName() , student.getCity());
		return r;
	}

	public int change(Student student) {
		String query = "update student set name=? , city = ? where id=?";
		int r = this.jdbcTemplate.update(query , student.getName() , student.getCity() , student.getId());
		return r;
	}

	public int delete(int studentId) {
		// delete operation
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query , studentId);
		return r;
	}

	public Student getStudent(int studentId) {
		// Selecting single student data
		String query = "select  *  from student where id=?";
		RowMapper<Student> rowMapper  = new RowMapperImp();				//Make an object of RowMapper and write the Implementation class of RowMapper
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper , studentId);
		
		return student;
	}

	public List<Student> getAllStudents() {
		// Selecting multiple student
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query , new RowMapperImp() );		//We got the RowMapper object 
		return students;
	}

	

	

	

	

}
