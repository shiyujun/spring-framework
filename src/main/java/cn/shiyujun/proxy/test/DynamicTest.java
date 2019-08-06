package cn.shiyujun.proxy.test;

import cn.shiyujun.proxy.handle.DynamicProxy;
import cn.shiyujun.proxy.service.MainService;
import cn.shiyujun.proxy.service.impl.MainServiceImpl;

public class DynamicTest {

    public static void main (String args[]){
        MainService mainService=new MainServiceImpl();
        DynamicProxy dynamicProxy=new DynamicProxy(mainService);
        ((MainService)dynamicProxy.getProxy()).doSomeThing();
    }


}
