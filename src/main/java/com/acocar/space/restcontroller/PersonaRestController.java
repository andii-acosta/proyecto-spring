package com.acocar.space.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acocar.space.model.Persona;
import com.acocar.space.service.PersonaService;

@RestController
@RequestMapping("/rest")
public class PersonaRestController {

	@Autowired
	private PersonaService personaService;
	
	//@RequestMapping(value = "/list",consumes = "application/json",produces = "application/json", method = RequestMethod.GET)
	@GetMapping
	public List<Persona> list(){
		return personaService.getAll();
	}
}
