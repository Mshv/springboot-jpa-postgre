package com.example.springboot2.component;

import com.example.springboot2.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
public class CommandLineAppStartupRunner implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

  @Autowired
  StudentService studentService;

  @Override
  public void run(String... args) throws Exception {
    logger.info(" *** CommandLineAppStartupRunner ***");
    studentService.save();
  }
}


