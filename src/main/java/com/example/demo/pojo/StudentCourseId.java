package com.example.demo.pojo;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

//@Data
//@Embeddable
public class StudentCourseId implements Serializable {
  /*  @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    private Course course;*/
}
