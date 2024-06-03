package com.api.fipe.controller;


import com.api.fipe.model.CategoriaModel;
import com.api.fipe.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriasService categoriasService;

    @PostMapping
    public void criarCategorias(@RequestBody String nomeCategoria){
        categoriasService.criarCategoria(nomeCategoria);
    }

    @GetMapping
    public List<CategoriaModel> buscarCategorias(){
        return categoriasService.buscarCategoria();
    }
}
