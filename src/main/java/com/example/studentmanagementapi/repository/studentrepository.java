package com.example.studentmanagementapi.repository;

import com.example.studentmanagementapi.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<student, Long> {
}