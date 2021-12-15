package com.example.web_registry;

import com.example.web_registry.Dataset.DatasetInitializer;
// import com.example.web_registry.runner.CRUDRunner;
import com.example.web_registry.runner.QueryRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebRegistryApplication {

	// static Class<?>[]runner = new Class<?>[]{DatasetInitializer.class, QueryRunner.class, WebRegistryApplication.class};

	public static void main(String[] args) {
		SpringApplication.run(WebRegistryApplication.class, args);
		// SpringApplication.run(runner, args);
	}

}
