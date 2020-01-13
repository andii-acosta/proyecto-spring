package com.acocar.space.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.acocar.space.commons.GenericServiceImpl;
import com.acocar.space.model.Persona;
import com.acocar.space.repo.IPersonaRepo;
import com.acocar.space.service.PersonaService;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{

	
	@Autowired
	private IPersonaRepo repo;
	
	
	@Override
	public JpaRepository<Persona, Long> getRepo() {
		return repo;
	}

}
