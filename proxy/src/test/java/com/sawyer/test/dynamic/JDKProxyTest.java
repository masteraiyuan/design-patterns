package com.sawyer.test.dynamic;

import com.sawyer.dynamic.JDKProxy;
import com.sawyer.service.IEat;
import com.sawyer.service.impl.EatService;
import org.junit.Test;

public class JDKProxyTest {

    @Test
    public void jdkProxyTest(){
        IEat eatService = JDKProxy.getProxyInstance(new EatService());
        eatService.dinner();
        eatService.lunch();
    }
}
