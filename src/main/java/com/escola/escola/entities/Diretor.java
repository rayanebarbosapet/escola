package com.escola.escola.entities;
import java.util.Scanner;

import com.escola.escola.entities.Pessoa;

public class Diretor extends Funcionario {

    public Diretor(String nome, String dataNascimento, String cpf, String matricula, Contato contatoEmergencia,
            Contato contato, int ctps) {
        super(nome, dataNascimento, cpf, matricula, contatoEmergencia, contato, ctps);
    }

    
    // interface metodo diretor,

    @Override
    public void fazerLogin() {
        String login = "diretor";
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
