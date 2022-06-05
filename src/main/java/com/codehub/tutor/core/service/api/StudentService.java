package com.codehub.tutor.core.service.api;

import com.codehub.tutor.core.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    /**
     * Get All students
     *
     * @return all registered students
     */
    List<Student> getAllStudent();

    /**
     * Get student by id
     * @param studentId selected student id
     * @return selected student
     */
    Student getStudentById(long studentId);

    /**
     * Delete student by id
     *
     * @param studentId student id
     * @return deleted
     */
    Student deleteStudentById(long studentId);

    /**
     * Update student by id
     *
     * @param studentId student id
     * @return updated student
     */
    Student updateStudentById(long studentId);

    /**
     * Add student
     *
     * @param student student
     * @return added student
     */
    Student addStudent(Student student);
}
