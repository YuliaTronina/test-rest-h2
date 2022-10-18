package com.example.testresth2.dao;


import com.example.testresth2.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent (Student student);

    Student getStudent (int id);

    void deleteStudent (int id);


}
