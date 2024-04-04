package com.kh.demo.service;

import com.kh.demo.entity.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);

    Course getCourseById(Long id);

    List<Course> getAllCourses();

    Course updateCourse(Course course);

    void deleteCourse(Long id);
}
