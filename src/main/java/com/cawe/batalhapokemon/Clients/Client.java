package com.cawe.batalhapokemon.Clients;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;

@Getter
@Setter
public class Client implements ClientInterface {

    protected String uriBasica;

    @Override
    public WebClient conexao() {
        WebClient webClient = WebClient
                .builder()
                .codecs(configurer -> configurer
                        .defaultCodecs()
                        .maxInMemorySize(50 * 1024 * 1024))
                .baseUrl(uriBasica)
                .defaultUriVariables(Collections.singletonMap("url", uriBasica))
                .build();
        return webClient;
    }

}