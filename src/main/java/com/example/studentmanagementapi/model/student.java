package com.example.studentmanagementapi.model;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data
    public class student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private String course;
    }

