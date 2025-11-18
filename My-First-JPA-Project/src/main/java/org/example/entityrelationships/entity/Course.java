package org.example.entityrelationships.entity;

import javax.persistence.*;

@Entity
public class Course {
    @Column(name = "course_name", nullable = false)
    private String courseName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseCode;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                '}';
    }
}
