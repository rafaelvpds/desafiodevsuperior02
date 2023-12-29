package com.rafaelvpds.desafiodevsuperior02.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_activities")
public class Activitie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Double price;

    @ManyToMany
    @JoinTable(name = "tb_activity_participant", joinColumns = @JoinColumn(name = "activity_id"), inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private List<Participant> participantes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Category categoria;

    @OneToMany(mappedBy = "atividade")
    private List<Block> blocos = new ArrayList<>();

    public Activitie() {
    }

    public Activitie(Long id, String name, String description, Double price, List<Participant> participantes,
            Category categoria, List<Block> blocos) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.participantes = participantes;
        this.categoria = categoria;
        this.blocos = blocos;
    }

    public List<Participant> getParticipantes() {
        return participantes;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }

    public List<Block> getBlocos() {
        return blocos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
