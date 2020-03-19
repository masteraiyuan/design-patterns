package com.sawyer.staticProxy;

import com.sawyer.service.IEat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EatStaticProxy implements IEat {

    private static final Logger LOGGER = LoggerFactory.getLogger(EatStaticProxy.class);

    private IEat iEat;

    public EatStaticProxy(IEat iEat) {
        LOGGER.info("init eat static proxy");
        this.iEat = iEat;
    }

    @Override
    public void lunch() {
        LOGGER.info("cookie for eat");
        iEat.lunch();
        LOGGER.info("washing up");
    }

    @Override
    public void dinner() {
        LOGGER.info("cookie for eat");
        iEat.dinner();
        LOGGER.info("washing up");
    }
}
