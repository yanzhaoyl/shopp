package com.yanzhaoyl.shopp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yanzhaoyl.shopp.common.service.SpasDemo;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		SpasDemo.main(null);
	}
}
