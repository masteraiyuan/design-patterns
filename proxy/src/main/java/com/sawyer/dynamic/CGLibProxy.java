package com.sawyer.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CGLibProxy.class);

    public <T> T createObject (Class<T> tClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tClass);
        enhancer.setClassLoader(tClass.getClassLoader());
        enhancer.setCallback(this);
        return (T)enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        LOGGER.info("do before invoke , method name is " + method.getName());
        Object result = methodProxy.invokeSuper(o, objects);
        LOGGER.info("do after invoke , method name is " + method.getName());
        return result;
    }
}
