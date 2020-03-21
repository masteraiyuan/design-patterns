package com.sawyer.test.dynamic;

import com.sawyer.dynamic.CGLibProxy;
import com.sawyer.service.impl.EatService;
import org.junit.Test;

public class CGLibProxyTest {

    @Test
    public void cglibProxyTest(){
        CGLibProxy cgLibProxy = new CGLibProxy();
        EatService eatService = cgLibProxy.createObject(EatService.class);
        eatService.dinner();
        eatService.lunch();
    }
}
