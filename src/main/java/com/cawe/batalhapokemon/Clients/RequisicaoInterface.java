package com.cawe.batalhapokemon.Clients;

import com.fasterxml.jackson.core.JsonProcessingException;
import reactor.core.publisher.Mono;

import java.util.Map;

public interface RequisicaoInterface {
    Map<String, Object> criarCorpoRequisicao();
    Mono<Map<String, Object>> enviaRequisicao() throws JsonProcessingException;
}
