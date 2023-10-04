package com.escola.escola.entities;
import java.util.ArrayList;

import lombok.Data;


public class Aluno extends Pessoa {
    
    private Float nota1;
    private Float nota2; 
    private Float media; 
    private Float nota3;
    private Turma turma;

    public Aluno() {
        
        
    }

    public Aluno(Float nota1, Float nota2, Float media, Float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.nota3 = nota3;
    }
    public Float getNota1() {
        return nota1;
    }
    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }
    public Float getNota2() {
        return nota2;
    }
    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }
    public Float getMedia() {
        return media;
    }
    public void setMedia(Float media) {
        this.media = media;
    }
    public Float getNota3() {
        return nota3;
    }
    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }
    static ArrayList <Aluno> listaDeAluno = new ArrayList<>();
    
     

    
}
