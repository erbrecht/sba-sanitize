package edu.drexel.it.sbadmintest;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SbAdminTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbAdminTestApplication.class, args);
    }

}
