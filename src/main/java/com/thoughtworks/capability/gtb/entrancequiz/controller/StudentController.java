package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    static List<Student> listOfStudent;

    private void createStudentList() {
        listOfStudent = new ArrayList<>();
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudentList() {
        createStudentList();
        return ResponseEntity.ok(listOfStudent);
    }
}


