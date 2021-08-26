package com.challenge.alkemy.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.alkemy.bo.Genero;
import com.challenge.alkemy.repository.GeneroRepository;

@Service
@Transactional
public class GeneroServiceImp implements GeneroService{

	@Autowired
	private GeneroRepository generoRepository;
	
	@Override
	public ArrayList<Genero> listarGenero(String nombre) {
		return (ArrayList<Genero>) generoRepository.findAll();
	}

	@Override
	public Genero listarGeneroPorId(Long idGenero) {
		return generoRepository.findById(idGenero).get();
	}

	@Override
	public void eliminacionGenero(Long idGenero) {
		generoRepository.deleteById(idGenero);
	}

	@Override
	public void edicionGenero(Genero genero) {
		generoRepository.save(genero);
	}

	@Override
	public Long creacionGenero(Genero genero) {
		generoRepository.save(genero);
		return genero.getIdGenero();
	}

}
