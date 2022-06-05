package com.codehub.tutor.core.service.impl;

import com.codehub.tutor.core.dao.StudentDAO;
import com.codehub.tutor.core.model.Student;
import com.codehub.tutor.core.service.api.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudent() {
        return studentDAO.findAll();
    }

    @Override
    public Student getStudentById(long studentId) {
        return studentDAO.getById(studentId);
    }

    @Override
    public void deleteStudentById(long studentId) {
        studentDAO.deleteById(studentId);
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
