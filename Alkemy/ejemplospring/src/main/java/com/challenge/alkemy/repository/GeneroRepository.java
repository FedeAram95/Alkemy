package com.challenge.alkemy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.challenge.alkemy.bo.Genero;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Long> {

}
