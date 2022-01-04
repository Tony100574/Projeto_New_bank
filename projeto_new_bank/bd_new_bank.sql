create database bd_new_bank;
use bd_new_bank;

insert into clientes (id, titular, email, agencia, numero, saldo, tipo_de_conta) values (null, "Ananda Elias", "ananda.elias@email.com", "0001", "11111-1"),
(null, "Andre Esposito", "andre.esposito@email.com", "0001", "22222-2"),
(null, "Beatrice Rocha", "beatrice.rocha@email.com", "0002", "11111-1"),
(null, "Carlos Silva", "carlos.silva@email.com", "0002", "22222-2"),
(null, "Antonio Silva", "antonio.silva@email.com", "0003", "33333-3");

insert into contas values (null, 100.00, "0 - Conta Corrente", 1), 
(null, 50.0, "0 - Conta Corrente", 2), 
(null, 50.0, "2 - Conta Investimentos", 2), 
(null, 50.0, "0 - Conta Corrente", 3),
(null, 50.0, "1 - Conta Poupança", 3),
(null, 100.0, "1 - Conta Poupança", 4),
(null, 20.0, "0 - Conta Corrente", 5),
(null, 30.0, "1 - Conta Poupança", 5),
(null, 50.0, "2 - Conta Investimentos", 5);
