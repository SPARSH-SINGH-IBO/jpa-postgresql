package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entitiy.Courses;

public interface CoursesServices {
	
	public List<Courses> getCourses(); 
	
	public Courses getCoursesId(int coursesId);
	
	public Courses postCourses(Courses courses); 
	
	public Courses putCourses(Courses courses); 
	
	public Courses deleteCourses(int coursesId); 

}
