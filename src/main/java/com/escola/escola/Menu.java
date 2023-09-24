package com.escola.escola;

import java.util.Scanner;

import lombok.Data;

@Data
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    

    static void menuPrincipalDiretor() {
        int escolha;
        System.out.println("Bem vindo, Diretor(a)! \n O que deseja fazer?");
        System.out.println("1- Adicinar Professor \n2- Editar Professor \n3- Excluir Professor \n4- Adicinar Turma \n5- Editar Turma \n6- Excluir Turma \n7- Ver Desempenho dos Professores \n8- Ver Melhores Alunos \n9- Sair");
        escolha = scanner.nextInt();

        switch(escolha){
            case 1:
            break;

            case 2:
            break;

            case 3:
            break;

            case 4:
            break;

            case 5:
            break;

            case 6:
            break;

            case 7:
            break;

            case 8:
            break;

            case 9:
            break;

            default:
            break;
        }



    }

    static void menuPrincipalProf() {
        System.out.println("Bem vindo ao menu de Professor!");

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bem vindo, Professor:\n ");
        // int escolha=0;

        // while (escolha!=3) {
        // System.out.println("1- alunos\n2- notas\n3- sair");
        // escolha = sc.nextInt();

        // switch (escolha) {
        // case 1 :
        // Aluno.listarAlunos();
        // break;
        // case 2 :
        // System.out.println("listando notas");

        // break;
        // case 3 :
        // System.out.println("saindo...");
        // break;
        // default :
        // System.out.println("insira uma opção válida");
        // break;
        // }

        // }

    }

    static void menuPrincipalAluno() {
        System.out.println("Bem vindo ao menu de Aluno!");
    }

}
