package com.course.service;

import java.util.List;
import java.util.Optional;

import com.course.entity.Course;

public interface CourseService {
	
   List<Course> getallCourses();
   Course addCourse(Course course);
   Course updateCourse(Course course);
  
   Optional<Course> getCoursebyID(int id);
   void deleteCoursebyId(int id);
   void deleteall();
   
}
