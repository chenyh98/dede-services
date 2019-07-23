package org.jlu.dede;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DedeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DedeApplication.class, args);
    }

}
