package org.example.springdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(* org.example.springdemo.CanonPrinter.*(..))")
    public void before(){
        System.out.println("I'm before!");
    }
    @After("execution(* org.example.springdemo.CanonPrinter.*(..))")
    public void after(){
        System.out.println("I'm after!");
    }
}
