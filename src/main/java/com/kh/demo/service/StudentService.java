package com.kh.demo.service;

import com.kh.demo.entity.one_to_many.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student update(Long id, Student student);

    Student findById(Long id);

    List<Student> findAll();

    void deleteById(Long id);
}
