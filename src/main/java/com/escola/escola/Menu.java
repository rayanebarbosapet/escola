package com.escola.escola;

import java.util.Scanner;

import com.escola.escola.entities.Aluno;

public class Menu {
    

    
    static void  menuPrincipalDiretor(){

        
    }
    static void menuPrincipalProf(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo, Professor:\n ");
        int escolha=0;
        
        while (escolha!=3) {
            System.out.println("1- alunos\n2- notas\n3- sair");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1 : 
                    Aluno.listarAlunos();
                    break;
                case 2 :
                    System.out.println("listando notas");
                    
                    break;
                case 3 :
                    System.out.println("saindo...");
                    break;
                default :
                    System.out.println("insira uma opção válida");
                    break;
            }
            
        }

    }
    static void menuPrincipalAluno(){

        
    }

}
