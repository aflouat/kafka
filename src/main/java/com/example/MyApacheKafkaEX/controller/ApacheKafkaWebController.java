package com.example.MyApacheKafkaEX.controller;


import org.apache.commons.logging.Log;
import org.apache.log4j.spi.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import  com.example.MyApacheKafkaEX.service.KafkaSender;;

@RestController
//@RequestMapping(value = "/javainuse-kafka/")
public class ApacheKafkaWebController {
	
 
	
	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
	

		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}

}
