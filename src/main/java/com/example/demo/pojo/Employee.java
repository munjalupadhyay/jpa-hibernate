package com.example.demo.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private AccessCard accessCard;

    @OneToMany(mappedBy = "employee" ,cascade = CascadeType.ALL)
    private List<SalarySlip> salarySlips= new ArrayList();

    @ManyToMany(mappedBy = "employees",cascade = CascadeType.ALL)
    List<EmailGroup> emailGroups = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessCard getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(AccessCard accessCard) {
        this.accessCard = accessCard;
    }

    public List<SalarySlip> getSalarySlips() {
        return salarySlips;
    }

    public void setSalarySlips(List<SalarySlip> salarySlips) {
        this.salarySlips = salarySlips;
    }

    public List<EmailGroup> getEmailGroups() {
        return emailGroups;
    }

    public void setEmailGroups(List<EmailGroup> emailGroups) {
        this.emailGroups = emailGroups;
    }

    public List<EmailGroup> addEmailGroup(EmailGroup emailGroup){
        this.emailGroups.add(emailGroup);
        return this.emailGroups;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accessCard=" + accessCard +
                ", salarySlips=" + salarySlips +
                ", emailGroups=" + emailGroups +
                '}';
    }
}
