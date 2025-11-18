package org.example.entityrelationships.entity;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(unique = true, nullable = false)
    private String studentEmail;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private StudentIDCard studentIDCard;

    public StudentIDCard getStudentIDCard() {
        return studentIDCard;
    }

    public void setStudentIDCard(StudentIDCard studentIDCard) {
        this.studentIDCard = studentIDCard;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentIDCard=" + studentIDCard +
                '}';
    }

}
