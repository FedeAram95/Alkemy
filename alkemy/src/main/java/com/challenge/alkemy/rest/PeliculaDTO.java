package com.challenge.alkemy.rest;

import java.util.Date;

import com.challenge.alkemy.bo.Pelicula;

public class PeliculaDTO {
	
	private Long idPelicula;
	private String imagen;
	private String titulo;
	private Date fechaCreacion;

	public PeliculaDTO(){
	}
	
	public PeliculaDTO(Pelicula pelicula) {
		this.idPelicula= pelicula.getId();
		this.imagen= pelicula.getImagen();
		this.titulo= pelicula.getTitulo();
		this.fechaCreacion= pelicula.getFechaCreacion();
	}

	public Long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
