package com.codetutr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codetutr.domain.Person;
import com.codetutr.service.RandomPersonGenerator;

@Controller
@RequestMapping("api")
public class RestController {
	
	@Autowired
	RandomPersonGenerator randomPersonGenerator;

	@RequestMapping("person/random")
	@ResponseBody
	public Person randomPerson() {
		return randomPersonGenerator.generate();
	}
}
