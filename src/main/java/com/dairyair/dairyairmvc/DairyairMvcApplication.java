package com.dairyair.dairyairmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.dairyair.dairyairmvc"})
@EnableJpaRepositories(basePackages="com.dairyair.dairyairmvc.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.dairyair.dairyairmvc.entities")
public class DairyairMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DairyairMvcApplication.class, args);
	}

}
