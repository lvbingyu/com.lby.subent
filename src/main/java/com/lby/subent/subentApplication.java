package com.lby.subent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class subentApplication {

	@Autowired
	Book book;

	@RequestMapping("/")
	public String index() {
		return book.getName() + "------" + book.getPrice();
	}

	/**
	 * 启动
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(subentApplication.class, args);
	}

}
