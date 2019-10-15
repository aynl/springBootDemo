package com.springboot.redis.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	    logger.info("start the service is ok !");
	}

}