package com.cawe.batalhapokemon.Controllers;

import com.cawe.batalhapokemon.DTOs.PokemonDto;
import com.cawe.batalhapokemon.Models.Pokemon;
import com.cawe.batalhapokemon.Services.PokemonService;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonController {
    final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @RequestMapping(path = "/treinador", method = RequestMethod.POST)
    @ResponseBody
    private Pokemon criarTreinador(@RequestBody @Validated PokemonDto pokemonDto) {
        var pokemon = new Pokemon();

        BeanUtils.copyProperties(pokemonDto, pokemon);

        Pokemon treinadorResponse = pokemonService.criarPokemon(pokemon);

        return treinadorResponse;
    }

    @RequestMapping(path = "/treinador", method = RequestMethod.PUT)
    @ResponseBody
    private Pokemon atualizarTreinador(@RequestBody @Validated PokemonDto pokemonDto) throws Exception {
        var pokemon = new Pokemon();

        BeanUtils.copyProperties(pokemonDto, pokemon);

        Pokemon treinadorResponse = pokemonService.atualizarPokemon(pokemon);

        return treinadorResponse;
    }

    @RequestMapping(path = "/treinador", method = RequestMethod.DELETE)
    @ResponseBody
    private Pokemon deletarTreinador(@RequestBody @Validated PokemonDto pokemonDto) throws Exception {
        var pokemon = new Pokemon();

        BeanUtils.copyProperties(pokemonDto, pokemon);

        Pokemon treinadorResponse = pokemonService.deletarPokemon(pokemon);

        return treinadorResponse;
    }
}
