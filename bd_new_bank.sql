create database bd_new_bank;
use bd_new_bank;

insert into contas (id, titular, email, agencia, numero, tipo_de_conta, saldo ) values (null, "Ananda Elias", "ananda.elias@email.com", "001-1", "11111-1", "0 - Conta Corrente", 0.00),
(null, "Andre Esposito", "andre.esposito@email.com", "002-2", "22222-2", "1 - Conta Poupanca", 0.01),
(null, "Beatrice Rocha", "beatrice.rocha@email.com", "003-3", "33333-3", "2 - Conta Investimento", 0.02),
(null, "Carlos Silva", "carlos.silva@email.com", "004-4", "44444-4", "0 - Conta Corrente", 0.03),
(null, "Antonio Silva", "antonio.silva@email.com", "005-5", "55555-5", "0 - Conta Corrente", 0.10);