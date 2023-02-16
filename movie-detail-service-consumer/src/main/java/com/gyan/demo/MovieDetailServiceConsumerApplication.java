package com.gyan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.gyan")
public class MovieDetailServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailServiceConsumerApplication.class, args);
	}

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
