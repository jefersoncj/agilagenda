package com.abia.agilagenda.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.abia.agilagenda.api.config.property.AgilAgendaApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AgilAgendaApiProperty.class)
public class AgilagendaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgilagendaApiApplication.class, args);
	}

}
