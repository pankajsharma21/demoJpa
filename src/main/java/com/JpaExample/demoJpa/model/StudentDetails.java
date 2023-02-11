package com.JpaExample.demoJpa.model;

import javax.persistence.*;

@Entity
@Table(name = "stdetails")
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "studentName")
     String StudentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }
}