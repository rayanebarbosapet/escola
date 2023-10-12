package com.escola.escola.entities;

import com.escola.escola.enums.Cargo;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class Funcionario extends Pessoa {
    private int ctps;
    private Cargo cargo;


}
