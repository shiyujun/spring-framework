package cn.shiyujun.proxy.test;

import cn.shiyujun.proxy.handle.StaticProxy;
import cn.shiyujun.proxy.service.MainService;
import cn.shiyujun.proxy.service.impl.MainServiceImpl;

public class StaticTest {

    public static void main (String args[]){
        MainService mainService=new MainServiceImpl();
        MainService staticProxy=new StaticProxy(mainService);
        staticProxy.doSomeThing();
    }


}
