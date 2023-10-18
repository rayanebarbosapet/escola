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

    // Método que soma as médias dos alunos referentes a uma turma

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
    }

    // Bubble sort para reorganizar as turmas com as melhores médias somadas
    public static void listaReorganizada() {

        calcularMediaDaTurma();
        Turma variavelAuxiliar = new Turma();

        for (int i = 0; i < listaDeTurmas.size(); i++) {
            for (int j = 0; j < (listaDeTurmas.size() - 1); j++) {
                if (listaDeTurmas.get(j).getSomaMediaAlunosDaTurma() < listaDeTurmas.get(j + 1)
                        .getSomaMediaAlunosDaTurma()) {
                    variavelAuxiliar = listaDeTurmas.get(j);
                    listaDeTurmas.set(j, listaDeTurmas.get(j + 1));
                    listaDeTurmas.set(j + 1, variavelAuxiliar);
                }
            }
        }

        System.out.println("-------LISTA ORGANIZADA PELAS MELHORES MÉDIAS -----");
        for (int i = 0; i < listaDeTurmas.size(); i++) {
            System.out.println("Turma: " + listaDeTurmas.get(i).getNome() + " | Média: "
                    + listaDeTurmas.get(i).getSomaMediaAlunosDaTurma());

        }

        System.out.println("-----" + listaDeTurmas.get(0).getNome() + " ganha a Taça das Casas!!!-----");

    }

}
