package com.xdd.testjvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestjvmApplication
{

    public static void main(String[] args) throws InterruptedException
    {

        SpringApplication.run(TestjvmApplication.class, args);
        List<byte[]> list =new ArrayList<>();
        int start =0 ;

        System.out.println("第一次提交");
        while (true){
            byte[] bytes = new byte[1024*1024*50];
            list.add(bytes);
            Thread.sleep(1000);
            System.out.println(++start);
        }
    }

}
