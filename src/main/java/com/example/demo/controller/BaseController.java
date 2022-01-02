package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    MyService service;

    @RequestMapping(method = RequestMethod.GET,path = "/")
    public void doIt() throws Exception {
        service.doIt();
    }
}
