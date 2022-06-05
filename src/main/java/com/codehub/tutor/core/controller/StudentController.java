package com.codehub.tutor.core.controller;

import com.codehub.tutor.core.common.Validator;
import com.codehub.tutor.core.model.Student;
import com.codehub.tutor.core.service.api.StudentServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/students")
public class StudentController {
    @Autowired
    StudentServiceAPI service;

    @GetMapping()
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(service.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id) {
        if (!Validator.isPositiveNumber(id)) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(service.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Student> addStudent(Student student) {
        return new ResponseEntity<>(service.addStudent(student), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id, Student student) {
        if (!Validator.isPositiveNumber(id) || student.getStudentId()!=id) new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(service.updateStudentById(student), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable long id) {
        if (!Validator.isPositiveNumber(id)) new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        service.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
