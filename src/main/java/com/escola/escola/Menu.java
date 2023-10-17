package com.escola.escola;

import java.util.Scanner;
import com.escola.escola.Login;

import com.escola.escola.entities.Aluno;
import com.escola.escola.entities.Diretor;
import com.escola.escola.entities.Professor;

import lombok.Data;

@Data
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);

    public static void menuPrincipalDiretor() {
        int escolha = 0;

        while (escolha != 9) {

            System.out.println("Bem vindo, Diretor(a)! \n O que deseja fazer?");
            System.out.println(
                    "1- Adicionar professor\n2- Editar Professor \n3- Listar professores \n4- Adicinar Turma \n5- Editar Turma \n6- Excluir Turma \n7- Ver Melhores Alunos \n8- Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Diretor.adicinarProfessor();
                    break;

                case 2:
                    Diretor.editarProfessor();
                    break;

                case 3:
                    Diretor.listarProfessores();
                    System.out.println("Aperte V para voltar:");
                    String cons = scannerString.nextLine();

                    if (cons.equals("V") || cons.equals("v")) {
                        Menu.menuPrincipalDiretor();
                    }
                    while (!(cons.equals("V") || cons.equals("v"))) {
                        System.out.println("opção inválida");
                        Diretor.listarProfessores();
                    }
                    break;

                case 4:
                    Diretor.adicinarTurma();
                    break;

                case 5:
                    Diretor.editarTurma();
                    break;

                case 6:
                    Diretor.excluirTurma();
                    break;

                case 7:
                    Diretor.verMelhoresAlunos();
                    break;

                case 8:
                    System.out.println("Saindo do Sistema");
                    Login.inicio();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

    public static void menuPrincipalProf() {
        int escolha = 0;

        while (escolha != 5) {

            System.out.println("Bem vindo, Professor(a)! \n O que deseja fazer?");
            System.out.println(
                    "1- Adicinar Aluno \n2- Editar Aluno \n3- Excluir Aluno \n4- Listar suas Turmas \n5- Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    //Professor.adicionarAluno();
                    break;

                case 2:
                    Professor.editarAluno();
                    break;

                case 3:
                    Professor.excluirAluno();
                    break;

                case 4:
                    Professor.listarTurma();
                    break;

                case 5:
                    System.out.println("Saindo do Sistema");
                    Login.inicio();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

    static void menuPrincipalAluno() {
       
        int escolha = 0;

        while (escolha != 5) {

            System.out.println("Bem vindo, aluno (a) \n O que deseja visualizar?");
            System.out.println(
                    "1- Ver notas \n2- ver recuperação \n3- ver nota substituida \n4- Ver faltas \n5- Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    //n.();
                    break;

                case 2:
                    // n.();
                    break;

                case 3:
                    // n.();
                    break;

                case 4:
                Aluno.verFalta();
                
                    break;
                case 5:
                    System.out.println("Saindo do Sistema");
                    Login.inicio();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }
}
