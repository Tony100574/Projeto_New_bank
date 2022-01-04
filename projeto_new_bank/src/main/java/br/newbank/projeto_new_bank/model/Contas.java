package br.newbank.projeto_new_bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Contas")
public class Contas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tipo_de_conta", length = 50, nullable = false)
    private String tipoDeConta;

    @Column(name = "saldo", nullable = false)
    private double saldo;

    @ManyToOne // N:1 = cada conta de um proprietário, mas um proprietário pode ter várias contas
    @JoinColumn(name = "id_clientes")
    @JsonIgnoreProperties("contas") // para cada proprietário, não traga a lista de contas 
    public Clientes owner; //owner = proprietario

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Clientes getOwner() {
        return owner;
    }

    public void setOwner(Clientes owner) {
        this.owner = owner;
    }

    
}
