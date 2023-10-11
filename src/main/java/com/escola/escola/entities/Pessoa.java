package com.escola.escola.entities;

import lombok.Data;

@Data
public abstract class Pessoa {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private Endereco endereco;
    private Contato contato;
    private String login;
    private String senha;
}
