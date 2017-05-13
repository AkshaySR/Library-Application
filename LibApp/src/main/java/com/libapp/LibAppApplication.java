package com.libapp;

import com.libapp.controller.UserController;
import com.libapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@SpringBootApplication
public class LibAppApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(
				LibAppApplication.class, args);

	}
}
