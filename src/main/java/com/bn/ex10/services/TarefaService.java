package com.bn.ex10.services;

import com.bn.ex10.models.TarefaModel;
import com.bn.ex10.repositories.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaModel criarTarefa(TarefaModel tarefa) {
        return repository.save(tarefa);
    }

    public List<TarefaModel> findAll() {
        return repository.findAll();
    }

    public TarefaModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarTarefa(Long id) {
        repository.deleteById(id);
    }
}