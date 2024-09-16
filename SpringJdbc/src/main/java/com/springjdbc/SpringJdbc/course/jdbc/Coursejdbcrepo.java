package com.springjdbc.SpringJdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springjdbc.SpringJdbc.course.Course;

@Repository
public class Coursejdbcrepo {

    @Autowired
    private JdbcTemplate springjdbctemplate;

    
    private static String INSERT_QUERY = """
    		  insert into course(id, coursename, teacher)
    		  values(?,?,?);
    """;
    private static String UPDATE_QUERY = """
    	    UPDATE course
    	    SET coursename = 'learn java updated',
    	        teacher = 'kajal updated'
    	    WHERE id = 1;
    	""";
    
    private static String DELETE_QUERY = """
    	    DELETE FROM course
    	    WHERE id = 1;
    	""";
//    public void insert(Course course, Course course2) {
////        springjdbctemplate.update(INSERT_QUERY);
//        springjdbctemplate.update(INSERT_QUERY , course.getId() , course.getCoursename(), course.getTeacher());
////        springjdbctemplate.update(UPDATE_QUERY);
////        springjdbctemplate.update(DELETE_QUERY);
//    }
    
    public void insert(Course... courses) {
        for (Course course : courses) {
        	springjdbctemplate.update(INSERT_QUERY, course.getId(), course.getCoursename(), course.getTeacher());
        }
    }
	
}
