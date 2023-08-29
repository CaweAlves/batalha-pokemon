package com.cawe.batalhapokemon.Services;

import com.cawe.batalhapokemon.Models.Treinador;
import com.cawe.batalhapokemon.Repositories.TreinadorRepository;
import org.springframework.stereotype.Service;

@Service
public class TreinadorService {

    final TreinadorRepository treinadorRepository;

    public TreinadorService(TreinadorRepository treinadorRepository) {
        this.treinadorRepository = treinadorRepository;
    }

    public Treinador criarTreinador(Treinador treinador) {
        return treinadorRepository.save(treinador);
    }

    public Treinador atualizarTreinador(Treinador treinador) throws Exception {
        if (treinador.getId() == null) {
            throw new Exception("para atualizar um funcionario é necessario enviar o id");
        }

        return treinadorRepository.save(treinador);
    }

    public void deletarTreinador(Treinador treinador) throws Exception {
        if (treinador.getId() == null) {
            throw new Exception("para atualizar um funcionario é necessario enviar o id");
        }

        treinadorRepository.delete(treinador);
    }
}
