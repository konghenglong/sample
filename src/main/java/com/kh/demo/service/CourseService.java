package com.kh.demo.service;

import com.kh.demo.entity.one_to_many.Course;

import java.util.List;

public interface CourseService {

    Course create(Course course);

    Course update(Long id, Course course);

    void deleteById(Long id);

    Course findById(Long id);

    List<Course> findAll();
}
