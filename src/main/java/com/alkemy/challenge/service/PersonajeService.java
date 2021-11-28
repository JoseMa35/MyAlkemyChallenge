package com.alkemy.challenge.service;

import com.alkemy.challenge.model.PersonajeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeService extends JpaRepository<PersonajeModel,Long> {
    //all crud database methods
}
