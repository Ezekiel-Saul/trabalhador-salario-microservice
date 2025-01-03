package com.zql.rest_template_salary.rest;

import com.zql.rest_template_salary.Entity.Trabalhador;
import com.zql.rest_template_salary.service.TrabalhadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trabalhadores")
public class TrabalhadorController {

    @Autowired
    private TrabalhadorService trabalhadorService;

    public TrabalhadorController(TrabalhadorService trabalhadorService) {
        this.trabalhadorService = trabalhadorService;
    }

    @PostMapping
    public Trabalhador addTrabalhador(@RequestBody Trabalhador trabalhador) {
        return trabalhadorService.addTrabalhador(trabalhador);
    }

    @GetMapping("/{id}")
    public Trabalhador getTrabalhador(@PathVariable int id) {
        return trabalhadorService.getTrabalhador(id);
    }

    @GetMapping("/{id}/salario")
    public double getTrabalhadorSalary(@PathVariable int id) {
        return trabalhadorService.getSalaryByIDTrabalhador(id);
    }

    @GetMapping
    public List<Trabalhador> getAllTrabalhadores() {
        return trabalhadorService.getAllTrabalhadores();
    }


}
