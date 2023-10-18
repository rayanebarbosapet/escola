package com.escola.escola;

import java.util.Scanner;

import com.escola.escola.entities.Aluno;
import com.escola.escola.entities.Diretor;
import com.escola.escola.entities.Professor;
import com.escola.escola.entities.Turma;

import lombok.Data;

@Data
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);

    public static void menuPrincipalDiretor() {
        int escolha = 0;

        while (escolha != 9) {

            System.out.println("Bem vindo, Diretor(a)! \n O que deseja fazer?");
            System.out.println("1- Adicionar professor\n2- Editar Professor \n3- Listar professores");
            System.out.println("4- Excluir professor \n5- Ver Ranking de Professor \n6- Ver melhores alunos");
            System.out.println("7-Adicinar Turma \n8- Editar Turma \n9- Listar Turmas \n10 - Excluir Turma \n11- Sair");

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
                    try {
                        Thread.sleep(6 * 1000);
                        System.out.println("Aperte V para voltar:");
                        String cons = scannerString.nextLine();

                        if (cons.equals("V") || cons.equals("v")) {
                            Menu.menuPrincipalDiretor();
                        }
                        while (!(cons.equals("V") || cons.equals("v"))) {
                            System.out.println("opção inválida");
                            Diretor.listarProfessores();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    Diretor.excluirProfessor();

                    break;

                case 5:
                    Diretor.verDesempenhoProfessor();

                    break;

                case 6:
                    Diretor.verMelhoresAlunos();

                    break;

                case 7:
                    Diretor.adicinarTurma();

                    break;

                case 8:
                    Diretor.editarTurma();

                    break;

                case 9:
                    Turma.listarTurmasExistentes();
                    try {
                        Thread.sleep(6 * 1000);
                        System.out.println("Aperte V para voltar:");
                        String cons = scannerString.nextLine();
            
                        if (cons.equals("V") || cons.equals("v")) {
                            Menu.menuPrincipalDiretor();
                        }
                        while (!(cons.equals("V") || cons.equals("v"))) {
                            System.out.println("opção inválida");
                            Diretor.listarProfessores();
                        }
                        // Converter minutos em milissegundos e fazer o programa dormir
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    break;
                case 10:
                    Diretor.excluirTurma();

                    break;

                case 11:
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

        while (escolha != 9) {

            System.out.println("Bem vindo, Professor(a)! \n O que deseja fazer?");
            System.out.println(
                    "1- Adicinar Aluno \n2- Editar Aluno \n3- Excluir Aluno \n4- Listar todos os alunos \n5-Adicionar notas dos alunos \n6- Ver status dos alunos \n7- Ver ficha completa de um aluno \n8- Listar suas Turmas \n9- Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Professor.adicionarAluno();
                    break;

                case 2:
                    Professor.editarAluno();
                    break;

                case 3:
                    Professor.excluirAluno();
                    break;

                case 4:
                    Professor.listarAlunos();
                    break;


                case 5:
                    Professor.adicionarNotas();
                    break;

                case 6:
                    Professor.imprimirStatusDosAlunos();
                    break;

                case 7:
                    Professor.listarAlunos();
                    System.out.println("Qual número do aluno que deseja ver?");
                    int aluno = scanner.nextInt();
                    Aluno.verFichaCompleta(aluno);

                    break;

                case 8:
                    Professor.listarTurma();
                    break;

                case 9:
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
