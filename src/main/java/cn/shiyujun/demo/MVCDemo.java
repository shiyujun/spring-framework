package cn.shiyujun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="cn.shiyujun.controller")
public class MVCDemo {
    public static void main (String args[]){
        SpringApplication.run(MVCDemo.class, args);
    }
}
