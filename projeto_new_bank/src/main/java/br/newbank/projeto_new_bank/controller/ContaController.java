package br.newbank.projeto_new_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public ResponseEntity<Contas> inserirConta(@RequestBody Contas cadastro) {
        Contas novaConta = repositorioContas.save(cadastro);

        return ResponseEntity.ok(novaConta);
    }

    @PutMapping
    public ResponseEntity<Contas> atualizarConta(@RequestBody Contas contas) {
        if (contas.getId() > 0) {
            Contas atualizarConta = repositorioContas.save(contas);

            return ResponseEntity.ok(atualizarConta);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagarConta(@PathVariable long id) {
        Contas contaEncontrada = repositorioContas.findById(id).orElse(null);
        if (contaEncontrada != null) {
            try {
                repositorioContas.deleteById(id);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }
        return ResponseEntity.notFound().build();
    }
}
