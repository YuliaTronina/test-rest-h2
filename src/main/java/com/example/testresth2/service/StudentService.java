package com.example.testresth2.service;

import com.example.testresth2.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public List <Student> getAllStudents();
    public Student getStudent(int id);
    public Student saveStudent (Student student);
    void deleteStudent(int id);
}
