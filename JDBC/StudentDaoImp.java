package com.spring.springjdbc.dao;
import org.springframework.jdbc.core.JdbcTemplate;

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
		return 0;
	}

	

	

	

}
