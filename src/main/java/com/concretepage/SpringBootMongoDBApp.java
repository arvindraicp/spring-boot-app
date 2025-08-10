package com.concretepage;

import com.concretepage.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
@SpringBootApplication
public class SpringBootMongoDBApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDBApp.class, args);
    }
}
