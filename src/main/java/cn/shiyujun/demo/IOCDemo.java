package cn.shiyujun.demo;

import cn.shiyujun.service.IOCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author syj
 * CreateTime 2019/7/18
 * describe:
 */
public class IOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
        IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.hollo());
    }
}
