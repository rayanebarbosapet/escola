package com.escola.escola.entities;

import java.util.Scanner;

public class Professor extends Funcionario{
    
       private double desempenho;
    // interface metodo do professor
    // construtor professor
   
    public Professor(String nome, String dataNascimento, String cpf, String matricula, Contato contatoEmergencia,
            Contato contato, int ctps, double desempenho) {
        super(nome, dataNascimento, cpf, matricula, contatoEmergencia, contato, ctps);
        this.desempenho = desempenho;
    }


     
    
   // metodos get e set
    public double getDesempenho() {
        return desempenho;
    }


    public void setDesempenho(double desempenho) {
        this.desempenho = desempenho;
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

}

