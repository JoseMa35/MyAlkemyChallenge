package com.alkemy.challenge.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movieOrSerie")
public class PeliculaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    //@ElementCollection(targetClass = PersonajeModel.class)
    private String image; // string con el path de la url de la imagen
    private String title;
    private LocalDate creationDate;
    private Integer classification;//1 to 5
    @ManyToMany(cascade = CascadeType.ALL)
    //@JsonIgnoreProperties("peliculamodels")
    private List<PersonajeModel> assocActor; //personajes asociadas
    private String genre;


    public PeliculaModel(){

    }

    public PeliculaModel(Long id,String image, String title,LocalDate creationDate,Integer classification, List<PersonajeModel> assocActor,String genre){
        this.id = id;
        this.image = image;
        this.title = title;
        this.creationDate = creationDate;
        this.classification = classification;
        this.assocActor = assocActor;
        this.genre = genre;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public List<PersonajeModel> getAssocActor() {
        return assocActor;
    }

    public void setAssocActor(List<PersonajeModel> assocActor) {
        this.assocActor = assocActor;
    }

    public String getGenre() {
        return genre;
    }
}
