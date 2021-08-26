package com.challenge.alkemy.rest;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.alkemy.bo.Genero;
import com.challenge.alkemy.service.GeneroService;

@RestController
@Controller
public class GeneroRestController {
	
	@Autowired
	private GeneroService generoService;
	
	
	  @GetMapping (path = "/id")
	  public ResponseEntity<GeneroDTO> listarGeneroPorId(@RequestParam @PathVariable Long idGenero){		  
		  Genero genero=  generoService.listarGeneroPorId(idGenero);		  
		  GeneroDTO generoDTO = new GeneroDTO(genero);
		  return ResponseEntity.ok(generoDTO);
	  }
	  
	  
	  @GetMapping(path = "/buscador")
	  public ResponseEntity<ArrayList<GeneroDTO>> listarGenero(@RequestParam String nombre){
		  ArrayList<Genero> genero= generoService.listarGenero(nombre);
		  ArrayList<GeneroDTO> generoDTO= new ArrayList<GeneroDTO>();
		  for(Genero g : genero) {
			  generoDTO.add(new GeneroDTO(g));
		  }
		  return ResponseEntity.ok(generoDTO);
		}
	  
	  
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping(path = "/id")
	  public ResponseEntity eliminacionGenero(@RequestParam @PathVariable Long idGenero) {
		generoService.eliminacionGenero(idGenero);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	 
	@SuppressWarnings("rawtypes")
	@PutMapping(path = "/id")
	  public ResponseEntity edicionGenero(@PathVariable @RequestParam Long idGenero, @Valid @RequestParam GeneroDTO generoDTO) {
		Genero genero= generoService.listarGeneroPorId(idGenero);
		genero.setIdGenero(generoDTO.getIdGenero());
		genero.setImagen(generoDTO.getImagen());
		genero.setNombre(generoDTO.getNombre());
	  	generoService.edicionGenero(genero);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	  @PostMapping
	  public ResponseEntity<GeneroDTO> creacionGenero(@Valid @RequestBody  GeneroDTO generoDTO){
		  Genero genero= new Genero();
		  genero.setIdGenero(generoDTO.getIdGenero());
		  genero.setImagen(generoDTO.getImagen());
		  genero.setNombre(generoDTO.getNombre());
	  	generoService.creacionGenero(genero);
		  return ResponseEntity.status(HttpStatus.CREATED).body(generoDTO);
	  }
}
