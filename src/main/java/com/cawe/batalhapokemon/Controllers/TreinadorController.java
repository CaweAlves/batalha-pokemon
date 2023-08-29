package com.cawe.batalhapokemon.Controllers;

import com.cawe.batalhapokemon.DTOs.TreinadorDto;
import com.cawe.batalhapokemon.Models.Treinador;
import com.cawe.batalhapokemon.Services.TreinadorService;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class TreinadorController {

    final TreinadorService treinadorService;

    public TreinadorController(TreinadorService treinadorService) {
        this.treinadorService = treinadorService;
    }

    @RequestMapping(path = "/treinador", method = RequestMethod.POST)
    @ResponseBody
    private Treinador criarTreinador(@RequestBody @Validated TreinadorDto treinadorDto) {
        var treinador = new Treinador();

        BeanUtils.copyProperties(treinadorDto, treinador);

        Treinador treinadorResponse = treinadorService.criarTreinador(treinador);

        return treinadorResponse;
    }
}
