package com.example.demo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "student_course")
/*@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.student",
                joinColumns = @JoinColumn(name = "student_id")),
        @AssociationOverride(name = "primaryKey.course",
                joinColumns = @JoinColumn(name = "course_id"))})*/
public class StudentCourse {

   // @EmbeddedId
    // private StudentCourseId primaryKey = new StudentCourseId();

    @Id @GeneratedValue int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    private Course course;

    @OneToOne(mappedBy = "studentCourse")
    private Review review;
}
