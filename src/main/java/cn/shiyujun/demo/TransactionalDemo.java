package cn.shiyujun.demo;

import cn.shiyujun.service.JDBCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionalDemo {
    public static void main (String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.shiyujun.config");
        JDBCService jdbcService=  context.getBean(JDBCService.class);
        jdbcService.testTransactional();
    }
}
