package com.example.studentmanagementapi.repository;

import com.example.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<Student, Long> {
}