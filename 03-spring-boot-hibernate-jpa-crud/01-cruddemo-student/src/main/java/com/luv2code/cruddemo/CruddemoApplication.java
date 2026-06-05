package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.enity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
//            createMultipleStudent(studentDAO);
//            findStudentById(studentDAO);
//            findAll(studentDAO);
            findByFirstName(studentDAO);
        };
    }

    private void createMultipleStudent(StudentDAO studentDAO) {
        // create the student obj
        System.out.println("Creating 2 student objects...");
        Student student = new Student("Silva", "Banana", "Silvia@gmail.com");
        Student student2 = new Student("Deni", "Banana", "Deni@gmail.com");

        // save the student obj
        System.out.println("Saving student object...");
        studentDAO.save(student);
        studentDAO.save(student2);

        // display id of the saved student
        System.out.println("Saved student. Generated ID: " + student.getId());
        System.out.println("Saved student. Generated ID: " + student2.getId());
    }

    private void createStudent(StudentDAO studentDAO) {
        // create the student obj
        System.out.println("Creating new student object...");
        Student student = new Student("Silva", "Huynh", "Silvia@gmail.com");

        // save the student obj
        System.out.println("Saving student object...");
        studentDAO.save(student);

        // display id of the saved student
        System.out.println("Saved student. Generated ID: " + student.getId());
    }

    private void findStudentById(StudentDAO studentDAO) {
        studentDAO.find(4);
    }

    private void findAll(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void findByFirstName(StudentDAO studentDAO) {
        List<Student> s = studentDAO.findByFirstName("Deni");
        for (Student student : s) {
            System.out.println(student);
        }
    }
}




















