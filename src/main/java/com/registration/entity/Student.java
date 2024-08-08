package com.registration.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="sutudents")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String mobile;
}
