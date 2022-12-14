package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/**
 * @author Jeremy Corbeilla <jeremy.corbeilla@fairfair.com>
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService( StudentRepository studentRepository ) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){
       return studentRepository.findAll();
    }

}
