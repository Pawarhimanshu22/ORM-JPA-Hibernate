package org.example.entityrelationships;

import org.example.entityrelationships.entity.Course;
import org.example.entityrelationships.entity.Student;
import org.example.entityrelationships.entity.StudentIDCard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentRead {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himanshuUnit02");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();


//        Student student = entityManager.find(Student.class, 1);
//        System.out.println(student);

//        StudentIDCard studentIDCard = entityManager.find(StudentIDCard.class, 6);
//        System.out.println(studentIDCard);


        Course course = entityManager.find(Course.class, 3);
        System.out.println(course.getCourseName() + " : " + course.getStudent().getStudentName());

        transaction.commit();


    }
}
