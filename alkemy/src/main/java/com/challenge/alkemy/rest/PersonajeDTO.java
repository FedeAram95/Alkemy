package com.challenge.alkemy.rest;

import com.challenge.alkemy.bo.Personaje;

public class PersonajeDTO {
	private Long idPersonaje;
	private String imagen;
	private String nombre;
	private Integer edad;
	private Long peso;
	
	public PersonajeDTO() {
	}
	
	public PersonajeDTO(Personaje personaje) {
		this.idPersonaje=personaje.getIdPersonaje();
		this.imagen=personaje.getImagen();
		this.nombre=personaje.getNombre();
		this.edad=personaje.getEdad();
		this.peso= personaje.getPeso();
	}

	public Long getIdPersonaje() {
		return idPersonaje;
	}

	public void setIdPersonaje(Long idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}
	
}
