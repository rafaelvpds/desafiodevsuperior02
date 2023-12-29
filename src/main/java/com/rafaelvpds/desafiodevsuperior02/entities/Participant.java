package com.rafaelvpds.desafiodevsuperior02.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participants")

public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "participantes")
    private List<Activitie> atividades = new ArrayList<>();

    public Participant() {
    }

    public Participant(Long id, String name, String email, List<Activitie> atividades) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.atividades = atividades;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Activitie> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Activitie> atividades) {
        this.atividades = atividades;
    }

}
