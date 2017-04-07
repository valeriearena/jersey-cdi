package com.jersey.cdi.helloworld.service;

import com.jersey.cdi.helloworld.bean.HelloWorldBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by valerie on 1/21/17.
 */
public class HelloWorldService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldService.class.getName());

    public HelloWorldBean getPatient(String greeting){

        LOGGER.debug("Hello!: {} ", greeting);

        HelloWorldBean bean = new HelloWorldBean();
        bean.setGreeting(greeting);
        return bean;
    }
}
