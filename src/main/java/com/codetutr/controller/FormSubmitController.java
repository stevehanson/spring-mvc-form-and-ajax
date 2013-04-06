package com.codetutr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codetutr.domain.Person;
import com.codetutr.domain.Person.Frequency;

@Controller
public class FormSubmitController {
	
	@ModelAttribute("frequencies")
	public Frequency[] frequencies() {
		return Frequency.values();
	}

	@RequestMapping(value="form", method=RequestMethod.GET)
	public String loadFormPage(Model m) {
		
		m.addAttribute("person", new Person());
		
		return "formPage";
	}
	
	@RequestMapping(value="form", method=RequestMethod.POST)
	public String submitForm(Person person, Model m) {
		m.addAttribute("message", "Successfully saved person: " + person.toString());
		return "formPage";
	}
}
