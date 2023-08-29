package com.cawe.batalhapokemon.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "acoesBatalha")
public class AcaoBatalha {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "batalhaID")
    private Batalha batalha;

    @ManyToOne
    @JoinColumn(name = "pokemonAtacanteID")
    private Pokemon pokemonAtacante;

    @ManyToOne
    @JoinColumn(name = "pokemonDefensorID")
    private Pokemon pokemonDefensor;

    @Column(nullable = false)
    private Integer turno;

    @Column(nullable = false)
    private int danoCausado;

    @Column(nullable = false)
    private String acaoDescricao;
}
