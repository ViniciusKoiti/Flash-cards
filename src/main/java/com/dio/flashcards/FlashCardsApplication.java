package com.dio.flashcards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing(dateTimeProviderRef = "dateTimeProvider")
public class FlashCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashCardsApplication.class, args);
	}

}
