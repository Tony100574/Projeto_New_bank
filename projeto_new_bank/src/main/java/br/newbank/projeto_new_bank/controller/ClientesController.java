package br.newbank.projeto_new_bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.newbank.projeto_new_bank.model.Clientes;
import br.newbank.projeto_new_bank.repository.ClientesRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesController {

@Autowired
private ClientesRepo repositorioClientes;

@GetMapping()
public List<Clientes> consultarClientes(){
    List<Clientes> listaClientes = (List<Clientes>) repositorioClientes.findAll();
    return listaClientes;
}

@GetMapping("/{id}")
    public ResponseEntity<Clientes> buscarCliente(@PathVariable long id) {
        
        Clientes clienteEncontrado = repositorioClientes.findById(id).orElse(null);

        if (clienteEncontrado != null) {
            return ResponseEntity.ok(clienteEncontrado);
        }

        return ResponseEntity.notFound().build(); 
    }

    @PostMapping
    public ResponseEntity<Clientes> cadastrarCliente(@RequestBody Clientes cadastro) {
        Clientes novoCliente = repositorioClientes.save(cadastro);

        return ResponseEntity.ok(novoCliente);
    }

}
