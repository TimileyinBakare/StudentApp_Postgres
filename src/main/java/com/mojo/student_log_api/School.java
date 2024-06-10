package com.mojo.student_log_api;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer Id;

    private String name;

    @OneToMany(mappedBy = "school")
    private List<Students> students;

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School(Integer id, String name) {
        Id = id;
        this.name = name;
    }

}
