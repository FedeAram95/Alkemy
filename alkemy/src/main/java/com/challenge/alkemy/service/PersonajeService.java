package com.challenge.alkemy.service;

import java.util.ArrayList;
import com.challenge.alkemy.bo.Personaje;


public interface PersonajeService {
	
	public ArrayList<Personaje> listarPersonajePorNombre(String nombre);
	public Personaje listarPersonajePorId(Long idPersonaje);
	public Personaje listarPersonajePorEdad(Long edad);
	public void eliminacionPersonaje(Long idPersonaje);
	public void edicionPersonaje(Personaje personaje);
	public Long creacionPersonaje( Personaje personaje);
}
