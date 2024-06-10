package com.mojo.student_log_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class StudentProfile {
    @Id
    @GeneratedValue
    private Integer Id;

    @OneToOne()
    @JoinColumn(
        name = "student_id"
    )
    private Students students;

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students; 
    }

    private String bio;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public StudentProfile() {
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }   
    
    
}
