package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.enity.Student;

import java.util.List;

public interface StudentDAO {

    void save (Student student);
    void find (Integer id);
    List<Student> findAll();
    List<Student> findByFirstName(String firstName);
}
