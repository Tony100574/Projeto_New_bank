package br.newbank.projeto_new_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.newbank.projeto_new_bank.model.Contas;
import br.newbank.projeto_new_bank.repository.ContasRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/contas")
public class ContasController {

    @Autowired
    private ContasRepo repositorioContas;

    @GetMapping
    public List<Contas> consultarContas() {
        List<Contas> listaContas = (List<Contas>) repositorioContas.findAll();

        return listaContas;
    }
}