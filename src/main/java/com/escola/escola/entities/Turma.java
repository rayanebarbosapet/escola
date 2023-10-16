package com.escola.escola.entities;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Turma {
    private String nome;
    private Double somaMediaAlunosDaTurma = 0.0;
    public static ArrayList<Turma> listaDeTurmas = new ArrayList<>();

    public static void listarTurmasExistentes() {
        System.out.println("-----TURMAS-----");
        for (int i = 0; i < listaDeTurmas.size(); i++) {
            System.out.println(i + " - " + listaDeTurmas.get(i).getNome());
        }
    }

    public static void calcularMediaDaTurma() {

        Aluno.calcularMedia();

        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            for (int j = 0; j < listaDeTurmas.size(); j++) {
                if (Aluno.listaDeAluno.get(i).getTurma() == listaDeTurmas.get(j)) {
                    listaDeTurmas.get(j).somaMediaAlunosDaTurma = (listaDeTurmas.get(j).somaMediaAlunosDaTurma
                            + Aluno.listaDeAluno.get(i).getMedia());

                }

            }

        }

        for (int l = 0; l < listaDeTurmas.size(); l++) {
            System.out.println("Turma: " + listaDeTurmas.get(l).nome + "| Soma Média dos Alunos: "
                    + listaDeTurmas.get(l).somaMediaAlunosDaTurma);

        }

        // materia- criar enum com as materias .

    }


}
