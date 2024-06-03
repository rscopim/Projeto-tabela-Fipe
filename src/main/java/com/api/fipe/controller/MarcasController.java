package com.api.fipe.controller;

import com.api.fipe.model.MarcaModel;
import com.api.fipe.model.dto.MarcaDTO;
import com.api.fipe.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/marcas")
public class MarcasController {

    @Autowired
    private MarcaService marcaService;

    @PostMapping
    public void criarMarca(@RequestBody MarcaDTO marcaDTO){
        marcaService.criarNovaMarca(marcaDTO.getNome(), marcaDTO.getIdCategoria());
    }

    @GetMapping
    public List<MarcaModel> buscarMarcas(){
        return marcaService.buscarListaDeMarcas();
    }

    @GetMapping("/{idCategoria}")
    public List<MarcaModel> buscarMarcasPorCategoria(@PathVariable(value = "idCategoria") Long idCategoria){
        return marcaService.buscarListaDeMarcasPorCategoria(idCategoria);
    }
}
