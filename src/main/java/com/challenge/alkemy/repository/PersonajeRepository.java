package com.challenge.alkemy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.challenge.alkemy.bo.Personaje;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje, Long>{

}
