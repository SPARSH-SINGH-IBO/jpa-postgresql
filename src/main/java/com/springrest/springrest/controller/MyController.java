package com.springrest.springrest.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.entitiy.Courses;
import com.springrest.springrest.services.CoursesServices;

@RestController
public class MyController {
	
	
	@Autowired	
	private CoursesServices coursesServices;  

	@GetMapping("/home")
	public String getHome() {
		return "Home Page spring rest on gradle jpa and postgresql example on intellij moved to git";
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Courses>> getCourses(){
		
		List<Courses> list = null; 
		
		try {
			list =coursesServices.getCourses(); 
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		
		return new ResponseEntity<List<Courses>> (list, HttpStatus.OK); 
	}
	
	@GetMapping("/courses/{id}")
	public ResponseEntity<Courses> getCoursesId(@PathVariable("id") int coursesId) {
		
		Courses obj = null; 

		
		try {
			obj =coursesServices.getCoursesId(coursesId); 
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		
		return new ResponseEntity<Courses> (obj, HttpStatus.OK); 
		
	}
	
	@PostMapping("/courses")
	public ResponseEntity<Courses> postCourses(@RequestBody Courses courses) {
		
		Courses obj = null; 
		
		try {
			obj =coursesServices.postCourses(courses); 
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		
		return new ResponseEntity<Courses> (obj, HttpStatus.OK); 
		
	}
	
	
	@PutMapping("/courses")
	public ResponseEntity<Courses> putCourses(@RequestBody Courses courses) {
		
		Courses obj = null; 
		
		try {
			obj =coursesServices.putCourses(courses); 
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		
		return new ResponseEntity<Courses> (obj, HttpStatus.OK); 
	}
	
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<Courses> deleteCourses(@PathVariable("id") int coursesId) {
		
		Courses obj = null; 
		
		
		try {
			obj =coursesServices.deleteCourses(coursesId); 
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		return new ResponseEntity<Courses> (obj, HttpStatus.OK); 
	}
	


}
