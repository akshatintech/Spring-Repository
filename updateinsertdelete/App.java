package com.spring.springjdbc;

import java.util.List;
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
       	
       //Set
       
//       Student student = new Student();
//       student.setId(123);
//       student.setName("Vedant");
//       student.setCity("Pune");
//       
//       int result = studentDao.insert(student);
//       System.out.println("Student added " + result);
     
       //Update
//       	Student student  =new Student();
//       	student.setId(666);
//       	student.setName("Raj Kumar");
//       	student.setCity("Kanpur");
//       	
//       	int result = studentDao.change(student);
//       	System.out.println("Student details changed" + result);
       
 //      int result = studentDao.delete(666);
       
//       Student student = studentDao.getStudent(456);
//       System.out.println(student);
       
       
       List<Student> students = studentDao.getAllStudents();
       for(Student s:students) {
    	   System.out.println(s);
       }
       
       /*
        1. From studentData getStudent() will be called.This will lead to calling of the Implementation class of the getStudent
        2.Becuase of Run-Time polymorphism it will go into StudentDao class and get StudentId 
        3. After that we create an object of the RowMapper. We directly cannot create an object of RowMapper class becuase it is an Interface
        3. Therefore we create an object of RowMapperImp.
        4. Then we will the set the Data and return the object
        5. Then using the JDBCTemplate object we have called the queryForObject method
        */
        
       
    }
    
}
