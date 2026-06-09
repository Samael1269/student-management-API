package com.example.studentmanagementapi.controller;
import com.example.studentmanagementapi.model.student;
import com.example.studentmanagementapi.service.studentservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")

public class studentcontroller {

    private final studentservice studentservice;

    public studentcontroller(studentservice studentservice) {
        this.studentservice = studentservice;
    }

    @PostMapping
    public student addStudent(@RequestBody student student) {
        return studentservice.addStudent(student);
    }

    @GetMapping
    public List<student> getAllStudents() {
        return studentservice.getAllStudents();
    }

    @GetMapping("/{id}")
    public student getStudentById(@PathVariable Long id) {
        return studentservice.getStudentById(id);
    }

    @PutMapping("/{id}")
    public student updateStudent(
            @PathVariable Long id,
            @RequestBody student student
    ) {
        return studentservice.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentservice.deleteStudent(id);
        return "Student deleted successfully";
    }
}