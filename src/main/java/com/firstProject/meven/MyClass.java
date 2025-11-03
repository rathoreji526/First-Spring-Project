package com.firstProject.meven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class MyClass {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Prints in console"); // this will print on console/terminal
        funCall();
        return "This is the first API created by myself";//this will return to the browser

    }
    @Autowired
    IOC i;
    void funCall(){
        System.out.println(i.sum());
    }

}
