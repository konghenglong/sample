package com.kh.demo.controller;

import com.kh.demo.entity.Course;
import com.kh.demo.entity.Teacher;
import com.kh.demo.service.CourseService;
import com.kh.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Long teacherId = course.getTeacher().getId();
        Teacher teacher = teacherService.getTeacherById(teacherId);
        course.setTeacher(teacher);
        Course createdCourse = courseService.createCourse(course);
        return ResponseEntity.ok(createdCourse);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> allCourses = courseService.getAllCourses();
        return ResponseEntity.ok(allCourses);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course course) {
        course.setId(id);
        Course updatedCourse = courseService.updateCourse(course);
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}