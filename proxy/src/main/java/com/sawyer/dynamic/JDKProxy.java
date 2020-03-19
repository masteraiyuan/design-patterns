package com.sawyer.dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

public class JDKProxy {

    private static final Logger LOGGER = LoggerFactory.getLogger(JDKProxy.class);

    public static <T> T getProxyInstance(T t) {
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), (o1, method, objects) -> {
            LOGGER.info("JDK proxy before");
            Object returnValue = method.invoke(t, objects);
            LOGGER.info("JDK proxy after");
            return returnValue;
        });
        return (T)o;
    }
}
