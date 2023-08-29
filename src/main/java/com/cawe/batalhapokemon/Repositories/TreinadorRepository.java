package com.cawe.batalhapokemon.Repositories;

import com.cawe.batalhapokemon.Models.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TreinadorRepository extends JpaRepository<Treinador, UUID> {
}
