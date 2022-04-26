package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.springrest.springrest.entitiy.Courses;
import com.springrest.springrest.repository.UserRepository;

@Service
public class CoursesServicesImpl implements CoursesServices {

	@Autowired
	private UserRepository userRepository; 
	
	
	public CoursesServicesImpl() {
		
	}

	@Override
	public List<Courses> getCourses() {
		
		return (List<Courses>) userRepository.findAll(); 
	}

	@Override
	public Courses getCoursesId(int coursesId) {
		
		
		return userRepository.findById(coursesId ).orElse(null); 
	}
	 
	@Override
	public Courses postCourses(Courses courses) {
		
		Courses temp = userRepository.findById(courses.getId()).orElse(null); 
		
		if(temp!=null) return null; 
		
		userRepository.save(courses);
		
		return courses;
	}

	@Override
	public Courses putCourses(Courses courses) {
		
		Courses temp = userRepository.findById(courses.getId()).orElse(null); 
		
		if(temp==null) return null; 
		
		userRepository.save(courses);
		
		return courses; 
		
	}

	@Override
	public Courses deleteCourses(int lol) {
		
		Courses temp = userRepository.findById(lol).orElse(null); 
		
		if(temp==null) return null; 
		
		userRepository.deleteById( lol);
		
		return temp; 
		
	}

}
