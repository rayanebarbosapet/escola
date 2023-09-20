package com.escola.escola.entities;
import java.util.Scanner;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    
    private double nota1;
    private double nota2; 
    private double media; 
    private double nota3;
    private static ArrayList <Aluno> listaAluno = new ArrayList<>();

    public double getNota1() {
        return nota1;
    }


    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public double getNota2() {
        return nota2;
    }


    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public double getMedia() {
        return media;
    }


    public void setMedia(double media) {
        this.media = media;
    }


    public double getNota3() {
        return nota3;
    }


    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    public static ArrayList<Aluno> getListaAluno() {
        return listaAluno;
    }


    public static void setListaAluno(ArrayList<Aluno> listaAluno) {
        Aluno.listaAluno = listaAluno;
    }

      @Override
    public void fazerLogin() {
        String login = "professor";
        String senha = "1234";
        String loginDigitado;
        String senhaDigitada;
        Scanner sc = new Scanner(System.in);

        System.out.println("Infome o login:");
        loginDigitado = sc.nextLine();
        System.out.println("Informe a senha:");
        senhaDigitada = sc.nextLine();

        if(login.equals(loginDigitado) && senha.equals(senhaDigitada)){
            System.out.println("Login Realizado com sucesso");
            
        } else if (!login.equals(loginDigitado) && !senha.equals(senhaDigitada)){
            System.out.println("Tanto o login, quanto a senha estão incorretos.");
            
        } else if (senhaDigitada != senha){
            System.out.println("Senha incorreta.");
        } else if (!loginDigitado.equals(login)){
            System.out.println("Login incorreta.");
        }
        sc.close();
    }

    
    public static void criarCadastro() {
        String novoNome = 

        Aluno novoAluno = new Aluno(novoNome, dataNascimento, cpf, matricula, contatoEmergencia,
        contato);
        listaAluno.add(novoAluno);
    }

    
    public void mostrarCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarCadastro'");
    }

    
    public static void listarAlunos() {
        for (int i = 0; i < getListaAluno().size(); i++ ){
            System.out.println( (i+1) + "- " + Aluno.getListaAluno().get(i).getNome());
        }
    }


    
}
