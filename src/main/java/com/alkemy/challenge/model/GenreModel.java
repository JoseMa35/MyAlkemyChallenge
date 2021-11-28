package com.alkemy.challenge.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genre")

public class GenreModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String image;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<PeliculaModel> assocWork;

    public GenreModel() {
    }

    public GenreModel(Long id,
                      String image,
                      String name,
                      List<PeliculaModel> assocWork)
    {
        this.id = id;
        this.image = image;
        this.name = name;
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

    public List<PeliculaModel> getAssocWork() {
        return assocWork;
    }

    public void setAssocWork(List<PeliculaModel> assocWork) {
        this.assocWork = assocWork;
    }
}
