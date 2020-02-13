package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication(scanBasePackages={"com.mycompany.app"})

public class App 
{
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String args[]) 
    {
        SpringApplication.run(App.class, args);
    }

}
