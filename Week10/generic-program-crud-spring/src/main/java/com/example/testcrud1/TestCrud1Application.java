package com.example.testcrud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCrud1Application {

	public static void main(String[] args) {
            try {
                SpringApplication.run(TestCrud1Application.class, args);
            } catch (Exception e) {
                e.printStackTrace();
            }
	}

}
