package com.codehub.tutor.core.controller;

import com.codehub.tutor.core.dao.StudentDAO;
import com.codehub.tutor.core.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/students")
public class StudentController {
    @Autowired
    private StudentDAO studentDAO;

    @GetMapping
    public ResponseEntity<List<Student>> getAll(){
        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@RequestParam long id){
        return studentDAO.findById(id);
    }
}
