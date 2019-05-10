package com.example.springboot2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaAuditing
@EnableTransactionManagement
public class Springboot2Application {

  private static final Logger LOGGER = LoggerFactory.getLogger(Springboot2Application.class);

  public static void main(String[] args) {
     SpringApplication.run(Springboot2Application.class, args);
  }
}