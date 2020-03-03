package com.sadman.service;

import com.sadman.model.Student;

import java.util.Optional;

/**
 * Created by Sadman on 3/3/2020.
 */
public class StudentService {
    public Optional<Student> getStudent(int id) {
        switch (id) {
            case 1:
                return Optional.of(new Student(1, "John", "Doe"));
            case 2:
                return Optional.of(new Student(2, "Jane", "Goodall"));
            case 3:
                return Optional.of(new Student(3, "Max", "Born"));
            default:
                return Optional.empty();
        }
    }
}
