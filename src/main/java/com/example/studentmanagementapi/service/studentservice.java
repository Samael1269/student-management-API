package com.example.studentmanagementapi.service;

import com.example.studentmanagementapi.model.student;
import com.example.studentmanagementapi.repository.studentrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {

    private final studentrepository studentrepository;

    public studentservice(studentrepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    public student addStudent(student student) {
        return studentrepository.save(student);
    }

    public List<student> getAllStudents() {
        return studentrepository.findAll();
    }

    public student getStudentById(Long id) {
        return studentrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public student updateStudent(Long id, student updatedStudent) {
        student existingStudent = getStudentById(id);

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setCourse(updatedStudent.getCourse());

        return studentrepository.save(existingStudent);
    }

    public void deleteStudent(Long id) {
        studentrepository.deleteById(id);
    }
}