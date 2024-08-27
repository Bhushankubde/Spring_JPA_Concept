package com.example.command;

import com.example.DaoService.StudentService;
import com.example.entities.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoSeviceCommandliner implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    private static final Logger logger = LoggerFactory.getLogger(UserDaoSeviceCommandliner.class);

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student();
        student1.setId(11);
        student1.setName("Tony");
        student1.setCity("GPO");
        studentService.studentdetails(student1);
        System.out.println(student1);
        logger.info(String.valueOf(student1));
    }
}
