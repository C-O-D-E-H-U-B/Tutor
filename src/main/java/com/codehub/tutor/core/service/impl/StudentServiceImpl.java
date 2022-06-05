package com.codehub.tutor.core.service.impl;

import com.codehub.tutor.core.dao.StudentDAO;
import com.codehub.tutor.core.model.Student;
import com.codehub.tutor.core.service.api.StudentServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceAPI {
    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.findAll();
    }

    @Override
    public Student getStudentById(long studentId) {
        return studentDAO.findById(studentId).orElse(null);
    }

    @Override
    public void deleteStudent(Student student) {
        studentDAO.delete(student);
    }

    @Override
    public Student updateStudentById(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public Student addStudent(Student student) {
        return studentDAO.save(student);
    }
}
