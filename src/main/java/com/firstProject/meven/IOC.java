package com.firstProject.meven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IOC {
    int num1;
    int num2;

    public IOC(@Value("10") int a,@Value("20") int b){
        this.num1 = a;
        this.num2 = b;
    }
    public int sum(){
        return num1+num2;
    }
}
