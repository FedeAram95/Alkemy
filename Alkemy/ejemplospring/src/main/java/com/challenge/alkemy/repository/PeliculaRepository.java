package com.challenge.alkemy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.challenge.alkemy.bo.Pelicula;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

}
