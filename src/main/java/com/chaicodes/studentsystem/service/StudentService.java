package com.chaicodes.studentsystem.service;

import java.util.List;

import com.chaicodes.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
