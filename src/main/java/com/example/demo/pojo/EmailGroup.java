package com.example.demo.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EmailGroup extends KeyedEntity<Integer> {

    private String name;

    @ManyToMany
    @JoinTable(name = "EmailGroup_Subscriptions",
            joinColumns = @JoinColumn(name="emailId"),
            inverseJoinColumns = @JoinColumn(name = "employeeId"))
    List<Employee> employees = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "EmailGroup{" +
                "name='" + name + '\'' +
                '}';
    }
}
