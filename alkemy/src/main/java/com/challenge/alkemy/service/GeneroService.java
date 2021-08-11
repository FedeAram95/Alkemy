package com.challenge.alkemy.service;

import java.util.ArrayList;

import com.challenge.alkemy.bo.Genero;


public interface GeneroService {
	
	public ArrayList<Genero> listarGenero(String nombre);
	public Genero listarGeneroPorId(Long idGenero);
	public void eliminacionGenero(Long idGenero);
	public void edicionGenero(Genero genero);
	public Long creacionGenero( Genero genero);

}
