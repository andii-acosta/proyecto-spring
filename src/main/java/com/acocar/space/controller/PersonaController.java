package com.acocar.space.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acocar.space.model.Persona;
import com.acocar.space.service.PersonaService;

@Controller
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@RequestMapping("/")
	public String index(Model modelo){
		modelo.addAttribute("list",personaService.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id, Model modelo){
		if(id != null && id != 0){
			modelo.addAttribute("Persona",personaService.get(id));
		}
		return "save";
	}
	
	@PostMapping("/person")
	public String save(Persona persona,Model modelo ){
		personaService.save(persona);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, Model modelo){
		personaService.delete(id);
		return "redirect:/";
	} 
}
