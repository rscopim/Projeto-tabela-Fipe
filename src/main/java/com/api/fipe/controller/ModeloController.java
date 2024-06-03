package com.api.fipe.controller;


import com.api.fipe.model.MarcaModel;
import com.api.fipe.model.ModeloModel;
import com.api.fipe.model.dto.MarcaDTO;
import com.api.fipe.model.dto.ModeloDTO;
import com.api.fipe.service.MarcaService;
import com.api.fipe.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/modelos")
public class ModeloController {

    @Autowired
    private ModeloService modeloService;

    @PostMapping
    public void criarModelo(@RequestBody ModeloDTO modeloDTO){
        modeloService.criarNovoModelo(modeloDTO.getNome(), modeloDTO.getIdMarca());
    }

    @GetMapping
    public List<ModeloModel> buscarMarcas(){
        return modeloService.buscarListaDeModelos();
    }

    @GetMapping("/{idMarca}")
    public List<ModeloModel> buscarModelosPorMarca(@PathVariable(value = "idMarca") Long idMarca){
        return modeloService.buscarListaDeModelosPorMarca(idMarca);
    }

}
