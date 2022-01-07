create database bd_new_bank;
use bd_new_bank;
select * from contas;
insert into contas (id, titular, email, agencia, numero, saldo, tipo_de_conta) values (null, "Ananda Elias", "ananda.elias@email.com", "0001", "11111-1", 100.00, "0 - Conta Corrente"),
(null, "Andre Esposito", "andre.esposito@email.com", "0001", "22222-2",  150.0, "0 - Conta Corrente"),
(null, "Beatrice Rocha", "beatrice.rocha@email.com", "0002", "11111-1",100.0, "1 - Conta Poupança"),
(null, "Carlos Silva", "carlos.silva@email.com", "0002", "22222-2", 250.0, "2 - Conta Investimentos"),
(null, "Antonio Silva", "antonio.silva@email.com", "0003", "33333-3", 500.0, "2 - Conta Investimentos");