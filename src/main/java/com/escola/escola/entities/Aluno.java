package com.escola.escola.entities;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Aluno extends Pessoa {
    
    private Float nota1;
    private Float nota2;
    private Float media;
    private int numerodeFaltas;
    private String status;
    private Turma turma;
    public static ArrayList <Aluno> listaDeAluno = new ArrayList<>();


}
