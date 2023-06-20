package com.devsuperior.dsevent.entities;

import java.time.Instant;

public class Bloco {

    private Long id;
    private Instant inicio;
    private Instant fim;

    public Bloco() {
    }

    public Bloco(Long id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }
}
