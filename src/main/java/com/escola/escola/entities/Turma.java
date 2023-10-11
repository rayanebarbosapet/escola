package com.escola.escola.entities;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Turma {
    private String nome;
    public static ArrayList<Turma> listaDeTurmas = new ArrayList<>();


    public static void listarTurmasExistentes(){
        System.out.println("-----TURMAS-----");
        for(int i = 0; i < listaDeTurmas.size(); i++){
            System.out.println(i + " - " + listaDeTurmas.get(i).getNome());
        }
    }
    
// materia- criar enum com as materias .

}
