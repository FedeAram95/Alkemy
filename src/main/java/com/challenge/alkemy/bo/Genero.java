package com.challenge.alkemy.bo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genero {

@Id
@GeneratedValue
 private Long idGenero;

 private String nombre;
 private Image imagen;
 
 @OneToMany
 private List<Pelicula> pelicula= new ArrayList<Pelicula>();

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

public Image getImagen() {
	return imagen;
}

public void setImagen(Image imagen) {
	this.imagen = imagen;
}

public List<Pelicula> getPelicula() {
	return pelicula;
}

public void setPelicula(List<Pelicula> pelicula) {
	this.pelicula = pelicula;
}



}
