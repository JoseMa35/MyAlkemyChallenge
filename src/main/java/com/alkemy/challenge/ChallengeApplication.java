package com.alkemy.challenge;

import com.alkemy.challenge.model.GenreModel;
import com.alkemy.challenge.model.PeliculaModel;
import com.alkemy.challenge.model.PersonajeModel;
import com.alkemy.challenge.service.GenreService;
import com.alkemy.challenge.service.PeliculaService;
import com.alkemy.challenge.service.PersonajeService;
import org.hibernate.type.LocalDateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Autowired
	private PeliculaService peliculaService;
	private PersonajeService personajeService;
	private GenreService genreService;
	@Override
	public void run(String... args) throws Exception {
		PeliculaModel pelicula = new PeliculaModel();
		PersonajeModel personaje = new PersonajeModel();
		GenreModel genero = new GenreModel();
		pelicula.setId(1L);
		pelicula.setTitle("Diehard");
		//LocalDate eventDate = new LocalDate(1988,12,25);
		//pelicula.setCreationDate(eventDate);
		personaje.setId(1L);
		personaje.setName("Bruce Willis");
		genero.setName("Accion");

		peliculaService.save(pelicula);
		personajeService.save(personaje);


		PeliculaModel pelicula1 = new PeliculaModel();
		PersonajeModel personaje1 = new PersonajeModel();
		GenreModel genero1 = new GenreModel();
		pelicula1.setTitle("Gone by the wind");
		personaje1.setId(3L);
		pelicula1.setId(5L);
		//LocalDate eventDate1 = new LocalDate(1930,12,25);
		//pelicula1.setCreationDate(eventDate1);
		personaje1.setName("Clark Gable");
		genero1.setName("Drama");

		peliculaService.save(pelicula1);
		personajeService.save(personaje1);


	}
}
