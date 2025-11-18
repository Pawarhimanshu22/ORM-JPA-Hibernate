package org.example.entityrelationships.entity;

import javax.persistence.*;

@Entity
public class StudentIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCardNo;
    private String softwareVersion;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "studentIDCard")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(int idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "StudentIDCard{" +
                "idCardNo=" + idCardNo +
                ", softwareVersion='" + softwareVersion + '\'' +
//                ", student=" + student +
                '}';
    }
}


