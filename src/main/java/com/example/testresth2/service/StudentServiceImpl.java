package com.example.testresth2.service;

import com.example.testresth2.dao.StudentDAO;
import com.example.testresth2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents (){
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudent (int id){
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public Student saveStudent (Student student){
        return studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent (int id){
        studentDAO.deleteStudent(id);
    }

}
