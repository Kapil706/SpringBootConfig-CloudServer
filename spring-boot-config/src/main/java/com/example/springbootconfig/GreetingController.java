package com.example.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {
	
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("Some static greeting message")
	private String staticGreetingMessage;
	
	@Value("${my.list.values}")
	private List<String>greetingList;
	
	/*
	@Value("#{${dbvalues}}")
	private Map<String,String> greetingObject;
	*/
	@GetMapping("/greeting")
	public String Greeting() {
		
		return  greetingMessage+""+staticGreetingMessage+""+greetingList+"";
		
	}
	
	
	@Autowired
	private DatabaseConnection databaseConnection;
	
	@GetMapping("/db")
	public String Database() {
		
		return databaseConnection.getConnection()+" "+databaseConnection.getHost();
		
	}
	
	/*
	@Autowired
	private Environment env;
	
	@GetMapping("/envObject")
	public String[] EnvironmentObject() {
		
		return env.getActiveProfiles();
		
	}
	
	*/
	
	
	
	

}
