package com.varren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        //System.setProperty("org.apache.catalina.connector.RECYCLE_FACADES", "true");
        SpringApplication.run(App.class, args);
       // DispatcherServlet
//        DelegatingHandlerMapping
    }
}
