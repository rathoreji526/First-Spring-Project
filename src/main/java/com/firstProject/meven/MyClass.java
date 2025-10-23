package com.firstProject.meven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("myProject")
    public String sayHello(){
        System.out.println(); // this will print on console/terminal
        return "First API"; //this will return to the browser
    }
}
