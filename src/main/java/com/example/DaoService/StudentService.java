package com.example.DaoService;

import com.example.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
@Transactional
public class StudentService {
    @PersistenceContext
    private EntityManager entityManager;

    public int studentdetails(Student student){
         entityManager.persist(student);
         return student.getId();
    }

}
