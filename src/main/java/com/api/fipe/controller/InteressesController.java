package com.api.fipe.controller;

import com.api.fipe.model.InteresseModel;
import com.api.fipe.service.InteresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interesses")
public class InteressesController {

    @Autowired
    private InteresseService service;

    @GetMapping
    public List<InteresseModel> buscarInteresses(){
        return service.buscarListaDeInteresses();
    }

    @PostMapping
    public void criarInteresses(@RequestBody String nome){
        service.criarNovoInteresse(nome);
    }

}
