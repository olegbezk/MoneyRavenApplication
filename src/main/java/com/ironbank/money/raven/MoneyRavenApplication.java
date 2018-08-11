package com.ironbank.money.raven;

import com.ironbank.money.raven.model.ProphetProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class MoneyRavenApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(MoneyRavenApplication.class);
		builder.headless(false).run(args); // fix from java.awt.HeadlessException throwing
	}
}
