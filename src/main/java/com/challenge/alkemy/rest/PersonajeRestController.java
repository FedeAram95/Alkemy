package com.challenge.alkemy.rest;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.challenge.alkemy.bo.Personaje;
import com.challenge.alkemy.service.PersonajeService;

@RestController
@RequestMapping(value= "/characters")
public class PersonajeRestController {

	
	@Autowired
	private PersonajeService personajeService;
	
	
	  @GetMapping (path = "/id")
	  public ResponseEntity<PersonajeDTO> listarPersonajePorId(@RequestParam @PathVariable Long idPersonaje){		  
		  Personaje personaje=  personajeService.listarPersonajePorId(idPersonaje);		  
		  PersonajeDTO personajeDTO = new PersonajeDTO(personaje);
		  return ResponseEntity.ok(personajeDTO);
	  }
	  
	  
	  @GetMapping (path = "/id")
	  public ResponseEntity<PersonajeDTO> listarPersonajePorNombre(@RequestParam @PathVariable String nombre){		  
		  PersonajeDTO personajeDTO = new PersonajeDTO();
		  return ResponseEntity.ok(personajeDTO);
	  }
	  
	  
	  @GetMapping (path = "/id")
	  public ResponseEntity<PersonajeDTO> listarPersonajePorEdad(@RequestParam @PathVariable Long edad){		  
		  Personaje personaje=  personajeService.listarPersonajePorEdad(edad);		  
		  PersonajeDTO personajeDTO = new PersonajeDTO(personaje);
		  return ResponseEntity.ok(personajeDTO);
	  }
	  
	  
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping(path = "/id")
	  public ResponseEntity eliminacionPersonaje(@RequestParam @PathVariable Long idPersonaje) {
	  	personajeService.eliminacionPersonaje(idPersonaje);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	 
	@SuppressWarnings("rawtypes")
	@PutMapping(path = "/id")
	  public ResponseEntity edicionPersonaje(@PathVariable @RequestParam Long idPersonaje, @Valid @RequestParam PersonajeDTO personajeDTO) {
	  	Personaje personaje= personajeService.listarPersonajePorId(idPersonaje);
	  	personaje.setIdPersonaje(personajeDTO.getIdPersonaje());
	  	personaje.setEdad(personajeDTO.getEdad());
	  	personaje.setNombre(personajeDTO.getNombre());
	  	personaje.setPeso(personajeDTO.getPeso());
	  	personaje.setImagen(personajeDTO.getImagen());
	  	personajeService.edicionPersonaje(personaje);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	  @PostMapping
	  public ResponseEntity<PersonajeDTO> creacionPersonaje(@Valid @RequestBody  PersonajeDTO personajeDTO){
	   Personaje personaje= new Personaje();
	  	personaje.setIdPersonaje(personajeDTO.getIdPersonaje());
	  	personaje.setEdad(personajeDTO.getEdad());
	  	personaje.setNombre(personajeDTO.getNombre());
	  	personaje.setPeso(personajeDTO.getPeso());
	  	personaje.setImagen(personajeDTO.getImagen());
        personajeService.creacionPersonaje(personaje);
		  return ResponseEntity.status(HttpStatus.CREATED).body(personajeDTO);
	  }
	 
	  
}
