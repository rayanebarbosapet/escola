package com.escola.escola.entities;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
<<<<<<< HEAD
=======
@EqualsAndHashCode(callSuper = true)
>>>>>>> 5500d6bc198eabf9ea496c47ce3b6cd7574e1065
public class Aluno extends Pessoa {
    private String login;
    private String senha;

    private Double nota1;
    private Double nota2;
    private Double media;
    private int numerodeFaltas;
    private String status;
    private Turma turma;
    public static ArrayList<Aluno> listaDeAluno = new ArrayList<>();

    public static void calcularMedia() {
        Double mediaCalculada;

        for (int i = 0; i < listaDeAluno.size(); i++) {
            try {
                if (listaDeAluno.get(i).getNota1() == null) {
                    listaDeAluno.get(i).nota1 = 0.0; // Substitua nota1 por 0 se for nula
                }

                if (listaDeAluno.get(i).getNota2() == null) {
                    listaDeAluno.get(i).nota2 = 0.0; // Substitua nota2 por 0 se for nula
                }

                mediaCalculada = (listaDeAluno.get(i).getNota1() + listaDeAluno.get(i).getNota2()) / 2;
                listaDeAluno.get(i).media = mediaCalculada;
            } catch (NullPointerException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

// ver nota
    public void verFaltas ( ){


        System.out.println( "Número de Faltas: " );
    }

}
