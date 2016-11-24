package com.jeda.whoami.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

	@RequestMapping("/hello")
	public String helloWorld() {

		return "Hello world !!";
	}

}
