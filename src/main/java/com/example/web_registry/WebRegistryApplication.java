package com.example.web_registry;

import com.example.web_registry.Dataset.DatasetInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebRegistryApplication {

	static Class<?>[]runner = new Class<?>[]{DatasetInitializer.class, WebRegistryApplication.class};

	public static void main(String[] args) {
		// SpringApplication.run(WebRegistryApplication.class, args);
		SpringApplication.run(runner, args);
	}

}
