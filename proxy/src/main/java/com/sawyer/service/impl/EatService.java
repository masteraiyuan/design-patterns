package com.sawyer.service.impl;

import com.sawyer.service.IEat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EatService implements IEat {

    private static final Logger LOGGER = LoggerFactory.getLogger(EatService.class);

    @Override
    public void lunch() {
        LOGGER.info("eat lunch");
    }

    @Override
    public void dinner() {
        LOGGER.info("eat dinner");
    }
}
