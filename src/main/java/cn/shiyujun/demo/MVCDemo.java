package cn.shiyujun.demo;

import cn.shiyujun.service.JDBCService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="cn.shiyujun.controller")
public class MVCDemo {
    public static void main (String args[]){
        SpringApplication.run(MVCDemo.class, args);
    }
}
