package br.newbank.projeto_new_bank.repository;

import org.springframework.data.repository.CrudRepository;

import br.newbank.projeto_new_bank.model.Contas;

public interface ContaRepo extends CrudRepository< Contas, Long> {

}   

