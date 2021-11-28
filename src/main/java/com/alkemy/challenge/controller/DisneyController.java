package com.alkemy.challenge.controller;

import com.alkemy.challenge.model.PeliculaModel;
import com.alkemy.challenge.model.PersonajeModel;
import com.alkemy.challenge.service.PersonajeService;
import com.alkemy.challenge.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisneyController {

    @Autowired
    private PersonajeService actor;
    private PeliculaService movie;

    @GetMapping(value = "holamundo")
    public String holaMundo(){
        return "hola Jose";
    }

    @GetMapping(value = "createActor")
    public PersonajeModel createActor(){
        PersonajeModel model = new PersonajeModel();
        model.setName("JoseMa");
        return  actor.save(model);
    }

    @GetMapping(value = "consultActors")
    public List<PersonajeModel> consultActor(){
        return actor.findAll();
    }

    @GetMapping(value = "createMovie")
    public PeliculaModel createMovie(){
        PeliculaModel model = new PeliculaModel();
        model.setTitle("DieHard");
        return  movie.save(model);
    }

    @GetMapping(value = "consultMovie")
    public List<PeliculaModel> consultMovie(){

        return movie.findAll();
    }
}
