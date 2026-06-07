package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.enity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements  StudentDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    // implement find method
    // no need @Transactional bc we only read data - no perform any update on the database
    @Override
    public void find(Integer id) {
        Student myStudent = entityManager.find(Student.class, id);
        System.out.println(myStudent);
    }

    // implement find all method
    // no need @Transactional
    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query1 = entityManager.createQuery("FROM Student order by firstName desc", Student.class);
        return query1.getResultList();
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE firstName=:theData", Student.class);
        query.setParameter("theData", firstName);
        return query.getResultList();
    }
}























