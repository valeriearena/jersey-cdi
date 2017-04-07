package com.jersey.cdi.helloworld.bean;

/**
 * Created by valerie on 1/21/17.
 */
public class HelloWorldBean {

    private String greeting = "Hi!!!";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
