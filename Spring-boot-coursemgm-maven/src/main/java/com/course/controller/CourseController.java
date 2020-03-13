package com.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Course;
import com.course.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Course> getallCourses() {
		return courseService.getallCourses();
	}

	@RequestMapping(value = "/addcourse", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public Optional<Course> getCoursebyID(@PathVariable int id) {

		return courseService.getCoursebyID(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Course updateCourse(@RequestBody Course course) {

		return courseService.updateCourse(course);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCoursebyId(@RequestBody int id) {
		courseService.deleteCoursebyId(id);

	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE)
	public void deleteall() {
		courseService.deleteall();

	}
	
	@RequestMapping(value = "{Course_Name}", method = RequestMethod.POST)
	//@RequestBody
	public Course addCourse1(@PathVariable @RequestParam Course Course_Name) {
		return this.courseService.addCourse(Course_Name);
	}
}
