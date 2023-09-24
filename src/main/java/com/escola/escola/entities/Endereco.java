package com.escola.escola.entities;

import com.escola.escola.enums.Uf;

import lombok.Data;

@Data
public class Endereco {
    
    private String logradouro;
    private int  numero;
    private String bairro;
    private String complemento;
    private int cep;
    private String cidade;
    private Uf uf;
    private String pais;

}
