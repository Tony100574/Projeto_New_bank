package br.newbank.projeto_new_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.newbank.projeto_new_bank.model.Contas;
import br.newbank.projeto_new_bank.repository.ContaRepo;

@org.springframework.stereotype.Controller
@RestController
@CrossOrigin("*")
@RequestMapping("/contas")

public class ContaController {

    @Autowired
    private ContaRepo repositorioContas;

    @GetMapping("")
    public List<Contas> consultaTodas() {
        List<Contas> listaContas = (List<Contas>) repositorioContas.findAll();
        return listaContas;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contas> buscarConta(@PathVariable long id) {

        Contas contaEncontrada = repositorioContas.findById(id).orElse(null);

        if (contaEncontrada != null) {
            return ResponseEntity.ok(contaEncontrada);
        }

        return ResponseEntity.notFound().build();
    }

}
