package org.example.springdemo;

import jakarta.annotation.PostConstruct;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Date;
@Component
public class HpPrinter implements Printer{

    @Value("${count}")
    private int count;

    @Override
    public void print(String message){
        count--;
        System.out.println("Hp印表機: "+message);
        System.out.println("剩餘使用次數: "+count);

    }
}
