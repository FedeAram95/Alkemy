package com.challenge.alkemy.service;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.challenge.alkemy.bo.Pelicula;
import com.challenge.alkemy.repository.PeliculaRepository;

@Service
@Transactional
public class PeliculaServiceImp implements PeliculaService {

	@Autowired
	private PeliculaRepository peliculaRepository;
	
	@Override
	public ArrayList<Pelicula> listarPeliculas(Pelicula pelicula) {
		return(ArrayList<Pelicula>) peliculaRepository.findAll();
	}

	@Override
	public Pelicula listarPeliculaPorId(Long idPelicula) {
		return peliculaRepository.findById(idPelicula).get();
	}

	@Override
	public void eliminacionPelicula(Long idPelicula) {
		peliculaRepository.deleteById(idPelicula);
	}

	@Override
	public void edicionPelicula(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}

	@Override
	public Long creacionPelicula(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
		return pelicula.getId();
	}

}
