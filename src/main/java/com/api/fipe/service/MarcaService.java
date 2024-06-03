package com.api.fipe.service;

import com.api.fipe.model.CategoriaModel;
import com.api.fipe.model.InteresseModel;
import com.api.fipe.model.MarcaModel;
import com.api.fipe.repository.CategoriaRepository;
import com.api.fipe.repository.InteresseRepository;
import com.api.fipe.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void criarNovaMarca(String nome, Long idCategoria){
        Optional<CategoriaModel> categoriaModel = categoriaRepository.findById(idCategoria);
        MarcaModel marcaModel = new MarcaModel(nome, categoriaModel.get());
        marcaRepository.save(marcaModel);
    }

    public List<MarcaModel> buscarListaDeMarcas(){
        return marcaRepository.findAll();
    }

    public List<MarcaModel> buscarListaDeMarcasPorCategoria(Long idCategoria){
        return marcaRepository.findByCategoriaModelId(idCategoria);
    }



}
