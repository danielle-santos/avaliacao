DROP DATABASE IF EXISTS SOFTWARE;

CREATE DATABASE SOFTWARE;
USE SOFTWARE;

CREATE TABLE CADASTRO_SOF(
ID_TITULO BIGINT PRIMARY KEY AUTO_INCREMENT,
TX_EMPRESA VARCHAR(50) NOT NULL,
TX_TIPO VARCHAR(100),
TX_CHAVE VARCHAR(100),
TX_LICENCA VARCHAR(50) NOT NULL
);


