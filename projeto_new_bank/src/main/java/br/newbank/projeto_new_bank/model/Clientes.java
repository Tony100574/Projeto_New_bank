package br.newbank.projeto_new_bank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titular", length = 250, nullable = false)
    private String titular;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "numero",length = 10, nullable = false)
    private String numero;

    @Column(name = "agencia", length = 5, nullable = false)
    private String agencia;

    @OneToMany(mappedBy = "owner")  // Um Cliente pode ter várias contas
                                    // owner = atributo do veículo que faz o relacionamento
    @JsonIgnoreProperties("owner")  // quando buscar as contas, não traga os usuários
    private List<Contas> contas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public List<Contas> getContas() {
        return contas;
    }

    public void setContas(List<Contas> contas) {
        this.contas = contas;
    }

    
}
