package com.alkemy.challenge.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "personaje")

public class PersonajeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
   // @ElementCollection(targetClass = PeliculaModel.class)
    private String image; // string con el path de la url de la imagen
    private String name;
    private Integer age;
    private String history;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<PeliculaModel> assocWork; //peliculas asociadas

    public PersonajeModel() {
    }

    public PersonajeModel(Long id, String image, String name, Integer age, String history, List<PeliculaModel> assocWork) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.age = age;
        this.history = history;
        this.assocWork = assocWork;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public List<PeliculaModel> getAssocWork() {
        return assocWork;
    }

    public void setAssocWork(List<PeliculaModel> assocWork) {
        this.assocWork = assocWork;
    }
}

