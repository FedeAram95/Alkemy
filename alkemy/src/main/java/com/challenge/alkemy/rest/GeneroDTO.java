package com.challenge.alkemy.rest;

import com.challenge.alkemy.bo.Genero;

public class GeneroDTO {

	 private Long idGenero;
	 private String nombre;
	 private String imagen;
	 
	 public GeneroDTO() {
		 
	 }
	 
	 public GeneroDTO(Genero genero){
		this.idGenero= genero.getIdGenero();
		this.nombre= genero.getNombre();
		this.imagen=genero.getImagen();
	}

	public Long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	 
	 
}
