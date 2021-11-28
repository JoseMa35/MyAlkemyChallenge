package com.alkemy.challenge.service;

import com.alkemy.challenge.model.PeliculaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreService extends JpaRepository<PeliculaModel, Long> {

}
