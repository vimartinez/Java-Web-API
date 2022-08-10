package com.educacionit.ej06.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/JWA")
public class Config extends ResourceConfig{
	
	public Config() {
		packages("com.educacionit.ej06.web");
	}

}
