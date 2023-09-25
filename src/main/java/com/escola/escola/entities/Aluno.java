package com.escola.escola.entities;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Aluno extends Pessoa {
    
    private double nota1;
    private double nota2; 
    private double media; 
    private double nota3;
    static ArrayList <Aluno> listaDeAluno = new ArrayList<>();

    
}
