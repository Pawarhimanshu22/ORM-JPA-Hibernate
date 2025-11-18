package org.example.entityrelationships;

import org.example.entityrelationships.entity.Course;
import org.example.entityrelationships.entity.Student;
import org.example.entityrelationships.entity.StudentIDCard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCreate {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentName("Himanshu");
        s1.setStudentEmail("himanshu@gmail.com");


        Student s2 = new Student();
        s2.setStudentName("Ankit");
        s2.setStudentEmail("ankit22@gmail.com");

        Student s3 = new Student();
        s3.setStudentName("Rohit");
        s3.setStudentEmail("rohit33@gmail.com");

        Student s4 = new Student();
        s4.setStudentName("Sonal");
        s4.setStudentEmail("sonal.22@gmail.com");



        StudentIDCard card1 = new StudentIDCard();
        card1.setSoftwareVersion("v1.0.1");

        StudentIDCard card2 = new StudentIDCard();
        card2.setSoftwareVersion("v1.0.2");

        StudentIDCard card3 = new StudentIDCard();
        card3.setSoftwareVersion("v2.0.1");

        StudentIDCard card4 = new StudentIDCard();
        card4.setSoftwareVersion("v2.0.2");


        Course course1 = new Course();
        course1.setCourseName("Mathematics");

        Course course2 = new Course();
        course2.setCourseName("Physics");

        Course course3 = new Course();
        course3.setCourseName("Chemistry");

        Course course4 = new Course();
        course4.setCourseName("Biology");

        Course course5 = new Course();
        course5.setCourseName("Computer Science");


        s1.setStudentIDCard(card1);
        s2.setStudentIDCard(card2);
        s3.setStudentIDCard(card3);
        s4.setStudentIDCard(card4);


        card1.setStudent(s1);
        card2.setStudent(s2);
        card3.setStudent(s3);
        card4.setStudent(s4);


        course1.setStudent(s1);
        course2.setStudent(s1);
        course3.setStudent(s1);
        course4.setStudent(s3);
        course5.setStudent(s4);




        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("himanshuUnit02");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(s3);
        entityManager.persist(s4);
        entityManager.persist(card1);
        entityManager.persist(card2);
        entityManager.persist(card3);
        entityManager.persist(card4);
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        entityManager.persist(course4);
        entityManager.persist(course5);


        transaction.commit();

    }
}
