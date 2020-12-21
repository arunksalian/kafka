package com.slin.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slin.app.demo.producer.SimpleMessageProducer;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private SimpleMessageProducer producer;
	
	@RequestMapping(path  = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String getHome () {
		return "home";
	}
	
	@RequestMapping(path  = "/send/{message}", method = RequestMethod.GET)
	@ResponseBody
	public String getHome (@PathVariable("message") String message) {
		producer.sendMessage(message);
		return "message send ...";
	}
	
	
}
