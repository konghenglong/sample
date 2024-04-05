package com.kh.demo.service;

import com.kh.demo.entity.one_to_many.Course;
import com.kh.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course update(Long id, Course course) {
        course.setId(id);
        return courseRepository.save(course);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}
