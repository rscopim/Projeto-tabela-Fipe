package com.api.fipe.service;

import com.api.fipe.model.InteresseModel;
import com.api.fipe.repository.InteresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteresseService {

    @Autowired
    private InteresseRepository repository;

    public void criarNovoInteresse(String nome){
        InteresseModel interesseModel = new InteresseModel(nome);
        repository.save(interesseModel);
    }

    public List<InteresseModel> buscarListaDeInteresses(){
        return repository.findAll();
    }

}
