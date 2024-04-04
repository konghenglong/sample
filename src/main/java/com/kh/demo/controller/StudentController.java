package com.kh.demo.controller;

import com.kh.demo.entity.Student;
import com.kh.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdTeacher = studentService.createStudent(student);
        return ResponseEntity.ok(createdTeacher);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return ResponseEntity.ok(allStudents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        Student updatedStudent = studentService.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
