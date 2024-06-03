package com.api.fipe.service;


import com.api.fipe.model.CategoriaModel;
import com.api.fipe.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void criarCategoria(String nomeCategoria){
        CategoriaModel categoria = new CategoriaModel(nomeCategoria);
        categoriaRepository.save(categoria);
    }

    public List<CategoriaModel> buscarCategoria(){
        return categoriaRepository.findAll();
    }

}
