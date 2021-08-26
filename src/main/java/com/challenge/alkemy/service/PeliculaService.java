package com.challenge.alkemy.service;

import java.util.ArrayList;
import com.challenge.alkemy.bo.Pelicula;


public interface PeliculaService {
	public ArrayList<Pelicula> listarPeliculas(Pelicula pelicula);
	public Pelicula listarPeliculaPorId(Long idPelicula);
	public void eliminacionPelicula(Long idPelicula);
	public void edicionPelicula(Pelicula pelicula);
	public Long creacionPelicula( Pelicula pelicula);
}
