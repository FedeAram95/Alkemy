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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.challenge.alkemy.bo.Pelicula;
import com.challenge.alkemy.service.PeliculaService;

@RestController
@Controller
@RequestMapping(value = "/movies")
public class PeliculaRestController{

	
	  @Autowired
		private PeliculaService peliculaService;
	
	
	  @GetMapping (path = "/id")
	  	public ResponseEntity<PeliculaDTO> listarPeliculaPorId(@RequestParam @PathVariable Long idPelicula){		  
		  Pelicula pelicula=  peliculaService.listarPeliculaPorId(idPelicula);		  
		  PeliculaDTO peliculaDTO = new PeliculaDTO(pelicula);
		  return ResponseEntity.ok(peliculaDTO);
	  }
	  
	  
	  @GetMapping(path = "/buscador")
	  	public ResponseEntity<ArrayList<PeliculaDTO>> listarPeliculas(@RequestParam Pelicula pelicula){
		  peliculaService.listarPeliculas(pelicula);
		  ArrayList<PeliculaDTO> peliculaDTO= new ArrayList<PeliculaDTO>();
		  return ResponseEntity.ok(peliculaDTO);
		}
	  
	  
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping(path = "/id")
	  	public ResponseEntity eliminacionPelicula(@RequestParam @PathVariable Long idPelicula) {
		  peliculaService.eliminacionPelicula(idPelicula);
		  return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	
	@SuppressWarnings("rawtypes")
	@PutMapping(path = "/id")
	  	public ResponseEntity edicionPelicula(@PathVariable @RequestParam Long idPelicula, @Valid @RequestBody PeliculaDTO peliculaDTO) {
		  Pelicula pelicula= peliculaService.listarPeliculaPorId(idPelicula);
		  pelicula.setTitulo(peliculaDTO.getTitulo());
		  pelicula.setId(peliculaDTO.getIdPelicula());
		  pelicula.setFechaCreacion(peliculaDTO.getFechaCreacion());
		  pelicula.setImagen(peliculaDTO.getImagen());
		  peliculaService.edicionPelicula(pelicula);
		  return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	  @PostMapping
	  	public ResponseEntity<PeliculaDTO> creacionPelicula(@Valid @RequestBody  PeliculaDTO peliculaDTO){
		  Pelicula pelicula= new Pelicula();
		  pelicula.setId(peliculaDTO.getIdPelicula());
		  pelicula.setTitulo(peliculaDTO.getTitulo());
		  pelicula.setFechaCreacion(peliculaDTO.getFechaCreacion());
		  pelicula.setImagen(peliculaDTO.getImagen());
		  peliculaService.creacionPelicula(pelicula);
		  return ResponseEntity.status(HttpStatus.CREATED).body(peliculaDTO);
	  }
	 
	
}
