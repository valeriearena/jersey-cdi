package com.jersey.cdi.helloworld.resource;

import com.jersey.cdi.helloworld.service.HelloWorldService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Created by valerie on 1/21/17.
 */
public class WebServiceBinder extends AbstractBinder {
        @Override
        protected void configure() {
            bind(HelloWorldService.class).to(HelloWorldService.class);
        }
}
