package com.bitstobytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("kafka")
public class KafkaController {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	static final String topic="DEMO_PRODUCER_TOPIC";
	
	@GetMapping("sendKakfaMessage")
	public String sendMessage() {
		
		kafkaTemplate.send(topic,"Bits To Bytes");
		
		return "test";
	}

	
}
