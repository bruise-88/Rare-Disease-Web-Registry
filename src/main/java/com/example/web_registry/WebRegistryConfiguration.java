package com.example.web_registry;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.ArangoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableArangoRepositories(basePackages = {"com.example.web_registry"})
public class WebRegistryConfiguration implements ArangoConfiguration {
    @Override
    public ArangoDB.Builder arango(){
        return new ArangoDB.Builder().host("localhost", 8529).user("root").password("sid shah");
    }

    @Override
    public String database() {
        return "web_registry";
    }   
}
