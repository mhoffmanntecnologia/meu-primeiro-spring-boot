package com.mhoffmann.meu_primeiro_springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double preco;

    public Produto() {

    }

    public Long getId() {
        return id;
    }

    public Produto(Long id, Double preco) {
        this.id = id;
        this.preco = preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
