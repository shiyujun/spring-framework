package cn.shiyujun.demo;

import cn.shiyujun.service.IOCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationIOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.shiyujun.config");
        IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.hollo());
    }
}
