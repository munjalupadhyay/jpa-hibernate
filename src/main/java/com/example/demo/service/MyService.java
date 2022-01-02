package com.example.demo.service;

import com.example.demo.pojo.*;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.transaction.UserTransaction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MyService {
    @Autowired
    EmployeeRepository employeeRepository;

    @PersistenceUnit
    EntityManagerFactory entityManagerFactory;

    @Autowired
    MyService _self;

    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager entityManager;// this is entitymanager which is shared across your application. so refrain from using this.
                                //   as your one thread might be writing an entity , another might also reading the data , guess what read will read something that is not even written to DB.
                                // rather it will real from persistance context. which is not even commited by first thread.
                                // so always use entityManagerFactory.createEntityManager() for writes. for reads you can still use shared entityManager


    //@Transactional(propagation = Propagation.REQUIRED)
    public void doIt() throws Exception {
        /*Employee e1 = new Employee();
        e1.setName("ganguram");
        AccessCard accessCard = new AccessCard();
        accessCard.setKey("key");
        e1.setAccessCard(accessCard);
        //accessCard.setEmployee(e1);

        SalarySlip s1= new SalarySlip();
        s1.setSalary(20d);
        s1.setDate(new Date());
        s1.setEmployee(e1);


        SalarySlip s2= new SalarySlip();
        s2.setSalary(20d);
        s2.setDate(new Date());
        s2.setEmployee(e1);

        List<SalarySlip> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        e1.setSalarySlips(list);


        EmailGroup emailGroup1 = new EmailGroup();
        emailGroup1.setName("SS_DEV");
        emailGroup1.addEmployee(e1);

        EmailGroup emailGroup2 = new EmailGroup();
        emailGroup2.setName("SS_DEV");
        emailGroup2.addEmployee(e1);

        e1.addEmailGroup(emailGroup1);
        e1.addEmailGroup(emailGroup2);

        employeeRepository.save(e1);*/




       /* EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction txn=manager.getTransaction();
        txn.begin();
        //Student student = new Student();
        //student.setName("Munjal Student");
        //manager.persist(student);*/

       _self.exampleSuported();

        /*Employee e1 = new Employee();
        e1.setName("ganguram");
        employeeRepository.save(e1);
        _self.persistEmployee();*/

        //txn.commit();
        System.out.println("ma ki ");

        //Employee e2=employeeRepository.findById(1);
        //System.out.println(e2);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void persistEmployee(){
        EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction txn=manager.getTransaction();
        txn.begin();
        Employee e = new Employee();
        e.setName("Munjal");
        manager.persist(e);
        int i=2;
        if(i %2 == 0) {
            throw new RuntimeException("fd");
        }
        txn.commit();
    }

    void doItOldWay(){
        EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction txn=manager.getTransaction();
        txn.begin();
        // persist whatwver you want here
        Employee e = new Employee();
        e.setName("Atmaram Tukaram Bide");
        manager.persist(e);
        txn.commit();
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void exampleSuported(){
        Employee e1 = new Employee();
        e1.setName("SUPPORTED");
        employeeRepository.save(e1);
        _self.exampleSuportedExample();
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void exampleSuportedExample(){
        Employee e1 = new Employee();
        e1.setName("Actuall SUPPORTED TXN ");
        Employee e2 = new Employee();
        e1.setName("Actuall SUPPORTED TXN ");
        employeeRepository.save(e1);
        employeeRepository.save(e2);
    }
}
