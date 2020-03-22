package com.example.MyApacheKafkaEX;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.MyApacheKafkaEX.service.KafkaSender;

@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBootHelloWorldApplication {


	public static void main(String[] args) {
		   Logger logger = LoggerFactory.getLogger(SpringBootHelloWorldApplication.class);
		    logger.info("Hello World");

		SpringApplication.run(
				new Object[] { SpringBootHelloWorldApplication.class }, args);
	}
}