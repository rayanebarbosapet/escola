package com.escola.escola.entities;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Aluno extends Pessoa {

    private Float nota1 = (float) 0;
    private Float nota2 = (float) 0;
    private Float media = (float) 0;
    private int numerodeFaltas;
    private String status;
    private Turma turma;
    public static ArrayList<Aluno> listaDeAluno = new ArrayList<>();

    public static void calcularMedia() {
        Float mediaCalculada;

        for (int i = 0; i < listaDeAluno.size(); i++) {
            mediaCalculada = (listaDeAluno.get(i).getNota1() + Aluno.listaDeAluno.get(i).getNota2()) / 2;
            listaDeAluno.get(i).media = mediaCalculada;
        }

    }
}
