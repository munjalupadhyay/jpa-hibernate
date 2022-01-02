package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Course  extends  KeyedEntity<Long>{

    private String courseName;
    private String instructorName;

    @OneToMany(mappedBy = "course",
            cascade = CascadeType.ALL)
    private Set<StudentCourse> studentList;
}
