package com.baeldung.hbase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHbaseConfigurationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(com.baeldung.hbase.SpringHbaseConfigurationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
