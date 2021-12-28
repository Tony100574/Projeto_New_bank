package br.newbank.projeto_new_bank.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/hello")

public class Hello {

  @GetMapping
  public String ola() {
    return "Hello";
  }
}
