package com.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.note.bean.Configuraiton;
import com.note.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuraiton configuration;

	
	@GetMapping(value = "/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		return new LimitsConfiguration(configuration.getMin(), configuration.getMax());
	}
	
	@GetMapping(value = "/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "fallbackCustomMethod")
	public LimitsConfiguration retrieveLimitsFromConfigurationHystrix() {
		throw new RuntimeException("not available");
	}
	LimitsConfiguration fallbackCustomMethod() {
		//Default Limits 
		return new LimitsConfiguration(0, Integer.MAX_VALUE);
	}
}
