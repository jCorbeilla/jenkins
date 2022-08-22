package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Jeremy Corbeilla <jeremy.corbeilla@fairfair.com>
 */
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long      id;
    private String    name;
    private String    email;
    private LocalDate dob;
    private Integer   age;


    public Student() {
    }


    public Student( long id, String name, String email, LocalDate dob, Integer age ) {
        this.id    = id;
        this.name  = name;
        this.email = email;
        this.dob   = dob;
        this.age   = age;
    }


    public long getId() {
        return id;
    }


    public Student setId( long id ) {
        this.id = id;

        return this;
    }


    public String getName() {
        return name;
    }


    public Student setName( String name ) {
        this.name = name;

        return this;
    }


    public String getEmail() {
        return email;
    }


    public Student setEmail( String email ) {
        this.email = email;

        return this;
    }


    public LocalDate getDob() {
        return dob;
    }


    public Student setDob( LocalDate dob ) {
        this.dob = dob;

        return this;
    }


    public Integer getAge() {
        return age;
    }


    public Student setAge( Integer age ) {
        this.age = age;

        return this;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}