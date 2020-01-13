package com.acocar.space.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acocar.space.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Long> {

}
