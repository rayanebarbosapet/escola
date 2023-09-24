package com.escola.escola.entities;

import com.escola.escola.enums.Cargo;

import lombok.Data;


@Data
public class Funcionario extends Pessoa {
    private int ctps;
    private Cargo cargo;


}
