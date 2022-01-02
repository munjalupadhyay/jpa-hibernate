package com.example.demo.pojo;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

//@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String instructorName;

    @OneToMany(mappedBy = "student",
            cascade = CascadeType.ALL)
    private Set<StudentCourse> studentCourses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Set<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }
}
