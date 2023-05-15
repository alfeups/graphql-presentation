package com.businessname.graphqlwithspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.businessname.graphqlwithspring.query","com.businessname.graphqlwithspring.resolver",
		"com.businessname.graphqlwithspring.repository", "com.businessname.graphqlwithspring.request",
		"com.businessname.graphqlwithspring.service", "com.businessname.graphqlwithspring.mutation"})
public class GraphqlWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlWithSpringApplication.class, args);
	}


}
