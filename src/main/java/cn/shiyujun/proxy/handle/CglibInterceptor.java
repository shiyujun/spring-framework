package cn.shiyujun.proxy.handle;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibInterceptor implements MethodInterceptor {


    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time:"+System.currentTimeMillis());
        Object object = methodProxy.invokeSuper(obj, objects);
        System.out.println("end time:"+System.currentTimeMillis());
        return object;
    }
}
