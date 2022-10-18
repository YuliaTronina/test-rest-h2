package com.example.testresth2.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table (name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;

    @NotBlank
    @Size(max = 32)
    @Column(name = "name")
    private String name;

    @NotBlank
    @Size(max = 32)
    @Column(name = "surname")
    private String surname;


    @Size(max = 32)
    @Column(name = "faculty")
    private String faculty;


    @Column(name = "age")
    private int age;

    public Student() {
    }
}