package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.dao.StudentDao;
import com.spring.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        //springjdbc => JDbc Template
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");
        
       StudentDao studentDao =  context.getBean("studentDao" , StudentDao.class);
       	
       Student student = new Student();
       student.setId(123);
       student.setName("Vedant");
       student.setCity("Pune");
       
       int result = studentDao.insert(student);
       System.out.println("Student added " + result);
    }
    
}
