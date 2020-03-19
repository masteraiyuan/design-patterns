package com.sawyer.test.staticProxy;

import com.sawyer.service.impl.EatService;
import com.sawyer.staticProxy.EatStaticProxy;
import org.junit.Before;
import org.junit.Test;

public class EatStaticProxyTest {

    private EatStaticProxy eatStaticProxy;

    @Before
    public void setUp(){
        eatStaticProxy = new EatStaticProxy(new EatService());
    }

    @Test
    public void lunchTest(){
        eatStaticProxy.lunch();
    }

    @Test
    public void dinnerTest(){
        eatStaticProxy.dinner();
    }
}
