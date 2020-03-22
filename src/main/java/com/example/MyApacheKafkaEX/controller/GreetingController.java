package com.example.MyApacheKafkaEX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.MyApacheKafkaEX.model.Greeting;
import com.example.MyApacheKafkaEX.service.KafkaSender;

@Controller
public class GreetingController {
	
	@Autowired
	KafkaSender kafkaSender;

	  @GetMapping(value="/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("greeting", new Greeting());
	    return "greeting";
	  }
	
	@PostMapping(value="/greeting")
	  public String greetingSubmit(@ModelAttribute Greeting greeting) {
		kafkaSender.send(greeting.getContent());
	    return "result";
	  }

}
