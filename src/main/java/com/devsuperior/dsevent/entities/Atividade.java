package com.devsuperior.dsevent.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;

        @Column(columnDefinition = "TEXT")
        private String descricao;
        private Double preco;

        @ManyToOne
        @JoinColumn(name = "categoria_id")
        private Categoria categoria;

        @ManyToMany
        @JoinTable(name = "tb_atividade_participante", joinColumns = @JoinColumn(name = "atividade_id"), inverseJoinColumns = @JoinColumn(name = "participante_id"))
        private Set<Participante> participantes = new HashSet<>();

        public Atividade() {
        }

        public Atividade(Long id, String nome, String descricao, Double preco) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) {
            this.preco = preco;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }

        public Set<Participante> getParticipante() {
                return participantes;
            }
    }
