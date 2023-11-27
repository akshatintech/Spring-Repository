package com.spring.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.springjdbc.dao.StudentDao;
import com.spring.springjdbc.dao.StudentDaoImp;

import javax.sql.DataSource;

@Configuration
public class Jdbcconfig {
	//declare bean as a method , bean as a annottation. For 3 beans we need to create 3 methods
	
	@Bean("ds")
	public DataSource getDataSource() {				//Return DataSource
		// We need to create an object of the DataSource
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;
		
		
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate	getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name = {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImp studentDao = new StudentDaoImp();		//As StudentDao is an interface , we need to create an object of StudentDaoImp
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}
	
	
}
