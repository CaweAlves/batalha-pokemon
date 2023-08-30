package com.cawe.batalhapokemon.Services;

import com.cawe.batalhapokemon.Models.Pokemon;
import com.cawe.batalhapokemon.Repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonService {
    final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Optional<Pokemon> buscarPokemon(Pokemon pokemon) {
        return pokemonRepository.findById(pokemon.getId());
    }

    public Pokemon criarPokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public Pokemon atualizarPokemon(Pokemon pokemon) throws Exception {
        if (pokemon.getId() == null) {
            throw new Exception("para atualizar um pokemon é necessario enviar o id");
        }
        return pokemonRepository.save(pokemon);
    }

    public Pokemon deletarPokemon(Pokemon pokemon) throws Exception {
        if (pokemon.getId() == null) {
            throw new Exception("para deletar um pokemon é necessario enviar o id");
        }
        return pokemonRepository.save(pokemon);
    }
}
