package com.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "Course_Table")
public class Course {
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Name")
	private String Course_Name;
	@Column(name = "Category")
	private String Course_Category;
	@Column(name = "Duration")
	private int Course_Duration;
	@Column(name = "Author")
	private String Course_Author;

	public Course() {
		
	}

	public String getCourse_Author() {
		return Course_Author;
	}

	public String getCourse_Category() {
		return Course_Category;
	}

	public int getCourse_Duration() {
		return Course_Duration;
	}

	public String getCourse_Name() {
		return Course_Name;
	}

	public int getId() {
		return id;
	}

	public void setCourse_Author(String course_Author) {
		Course_Author = course_Author;
	}

	public void setCourse_Category(String course_Category) {
		Course_Category = course_Category;
	}

	public void setCourse_Duration(int course_Duration) {
		Course_Duration = course_Duration;
	}

	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", Course_Name=" + Course_Name + ", Course_Category=" + Course_Category
				+ ", Course_Duration=" + Course_Duration + ", Course_Author=" + Course_Author + "]";
	}
}
