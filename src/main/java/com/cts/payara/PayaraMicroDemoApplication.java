package com.cts.payara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PayaraMicroDemoApplication extends SpringBootServletInitializer  {
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(PayaraMicroDemoApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(PayaraMicroDemoApplication.class, args);
	}
}
