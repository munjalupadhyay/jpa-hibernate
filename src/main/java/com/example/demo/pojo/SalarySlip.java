package com.example.demo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SalarySlip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double salary;

    @Temporal(TemporalType.DATE)
    Date date;

    @ManyToOne
    @JoinColumn(name="empId")
    Employee employee;



    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "SalarySlip{" +
                "id=" + id +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
