package com.cawe.batalhapokemon.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "treinadores")
public class Treinador {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 40)
    private String nome;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private Integer idade;
}
