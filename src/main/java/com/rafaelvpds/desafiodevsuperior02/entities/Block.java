package com.rafaelvpds.desafiodevsuperior02.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_blocks")
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant finish;
    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private Activitie atividade;

    public Block() {
    }

    public Block(Long id, Instant start, Instant finish) {
        this.id = id;
        this.start = start;
        this.finish = finish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getFinish() {
        return finish;
    }

    public void setFinish(Instant finish) {
        this.finish = finish;
    }

    public Activitie getAtividade() {
        return atividade;
    }

    public void setAtividade(Activitie atividade) {
        this.atividade = atividade;
    }

}
