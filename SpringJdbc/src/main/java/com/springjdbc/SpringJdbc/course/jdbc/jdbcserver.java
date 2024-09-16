package com.springjdbc.SpringJdbc.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springjdbc.SpringJdbc.course.Course;
import com.springjdbc.SpringJdbc.course.jdbc.Coursejdbcrepo;
@Component
public class jdbcserver implements CommandLineRunner {
	
	@Autowired
	private Coursejdbcrepo repo;
	

	@Override
	public void run(String... args) throws Exception {
		repo.insert(
				new Course(1,"Learn Java","Kajal Kumawat"),
				new Course(2,"Learn Aws","Ashutosh Singhal"),
				new Course(3,"Learn Aws","Ashutosh Singhal")
				);
	}
}
