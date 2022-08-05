package com.educacionit.ej05.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class Config extends ResourceConfig{
	
	public Config() {
		packages("com.educacionit.ej05.web");
	}

}
