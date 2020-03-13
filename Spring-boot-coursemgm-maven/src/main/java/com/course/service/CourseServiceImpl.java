package com.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.course.dao.CourseDao;
import com.course.entity.Course;

@Component
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseDao courseDao;
	
	
	@Override
	public List<Course> getallCourses() {
	return courseDao.findAll();
	}
	
	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);
	}
	
	@Override
	public Optional<Course> getCoursebyID(int id) {
	
		return courseDao.findById(id);
	}
	@Override
	public Course updateCourse(Course course) {
		
		return courseDao.save(course);
	}
	@Override
	public void deleteCoursebyId(int id) {
		courseDao.deleteById(id);
		
	}@Override
	public void deleteall() {
		courseDao.deleteAll();
		
	}

}
