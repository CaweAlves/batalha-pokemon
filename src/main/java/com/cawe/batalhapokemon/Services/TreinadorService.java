package com.cawe.batalhapokemon.Services;

import com.cawe.batalhapokemon.Models.Treinador;
import com.cawe.batalhapokemon.Repositories.TreinadorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TreinadorService {

    final TreinadorRepository treinadorRepository;

    public TreinadorService(TreinadorRepository treinadorRepository) {
        this.treinadorRepository = treinadorRepository;
    }

    public Optional<Treinador> buscarTreinador(Treinador treinador){
        return treinadorRepository.findById(treinador.getId());
    }

    public Treinador criarTreinador(Treinador treinador) {
        return treinadorRepository.save(treinador);
    }

    public Treinador atualizarTreinador(Treinador treinador) throws Exception {
        if (treinador.getId() == null) {
            throw new Exception("para atualizar um treinador é necessario enviar o id");
        }

        return treinadorRepository.save(treinador);
    }

    public void deletarTreinador(Treinador treinador) throws Exception {
        if (treinador.getId() == null) {
            throw new Exception("para deletar um treinador é necessario enviar o id");
        }

        treinadorRepository.delete(treinador);
    }
}
