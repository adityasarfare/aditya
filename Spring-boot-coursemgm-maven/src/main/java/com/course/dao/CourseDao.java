package com.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.course.entity.Course;

@Component
public interface CourseDao extends JpaRepository<Course, Integer>{

}
