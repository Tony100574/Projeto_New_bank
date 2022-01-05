package br.newbank.projeto_new_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.newbank.projeto_new_bank.model.Contas;
import br.newbank.projeto_new_bank.repository.Saverepo;

@RestController

public class SaveController {

  @Autowired
  private Saverepo saveConta;

  @RequestMapping(value = "/contas", method = RequestMethod.POST)
  public String cadastro(Contas contas) {
    saveConta.save(contas);
    return "redirect:/contas";
  }
}
