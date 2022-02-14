package com.example.springbootconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("db")
public class DatabaseConnection {
	
	private String connection;
	private String host;
	private int port;
	
	
	public String getConnection() {
		return connection;
	}
	public String getHost() {
		return host;
	}
	public int getPort() {
		return port;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	

}
