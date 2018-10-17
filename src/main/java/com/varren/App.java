package com.varren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        //System.setProperty("org.apache.catalina.connector.RECYCLE_FACADES", "true");
        SpringApplication.run(App.class, args);
    }
}
