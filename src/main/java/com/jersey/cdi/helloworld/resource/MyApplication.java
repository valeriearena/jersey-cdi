package com.jersey.cdi.helloworld.resource;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by valerie on 1/21/17.
 */
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        register(new WebServiceBinder());
        packages(true, "com.jersey.cdi.helloworld.resource");
    }
}