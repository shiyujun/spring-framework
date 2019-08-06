package cn.shiyujun.proxy.test;

import cn.shiyujun.proxy.handle.CglibInterceptor;
import cn.shiyujun.proxy.service.MainService;
import cn.shiyujun.proxy.service.impl.MainServiceImpl;
import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {

    public static void main (String args[]){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MainServiceImpl.class);
        enhancer.setCallback(new CglibInterceptor());
        MainService proxy= (MainService)enhancer.create();
        proxy.doSomeThing();
    }
}
