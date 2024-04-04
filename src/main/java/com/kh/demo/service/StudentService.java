package com.kh.demo.service;

import com.kh.demo.entity.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Long id);

}
