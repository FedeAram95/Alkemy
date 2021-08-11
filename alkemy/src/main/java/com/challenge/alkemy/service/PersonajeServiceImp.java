package com.challenge.alkemy.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.challenge.alkemy.bo.Personaje;
import com.challenge.alkemy.repository.PersonajeRepository;



@Service
@Transactional
public class PersonajeServiceImp implements PersonajeService{

	@Autowired
	private PersonajeRepository personajeRepository;

	@Override
	public Personaje listarPersonajePorId(Long idPersonaje) {
		return  personajeRepository.findById(idPersonaje).get();
	}
	
	@Override
	public Personaje listarPersonajePorEdad(Long edad) {
		return  personajeRepository.findById(edad).get();
	}


	@Override
	public ArrayList<Personaje> listarPersonajePorNombre(String nombre) {
		return (ArrayList<Personaje>) personajeRepository.findAll();
	}


	@Override
	public void eliminacionPersonaje(Long idPersonaje) {
		personajeRepository.deleteById(idPersonaje);
	}

	@Override
	public void edicionPersonaje(Personaje personaje) {
		personajeRepository.save(personaje);
		
	}

	@Override
	public Long creacionPersonaje(Personaje personaje) {
		personajeRepository.save(personaje);
		return personaje.getIdPersonaje();
	}

}
