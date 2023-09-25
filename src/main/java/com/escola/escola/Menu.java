package com.escola.escola;

import java.util.Scanner;

import com.escola.escola.entities.Diretor;
import com.escola.escola.entities.Professor;

import lombok.Data;

@Data
public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipalDiretor() {
        int escolha;
        System.out.println("Bem vindo, Diretor(a)! \n O que deseja fazer?");
        System.out.println(
                "1- Adicinar Professor \n2- Editar Professor \n3- Excluir Professor \n4- Adicinar Turma \n5- Editar Turma \n6- Excluir Turma \n7- Ver Desempenho dos Professores \n8- Ver Melhores Alunos \n9- Sair");
        escolha = scanner.nextInt();

        while (escolha != 9) {

            switch (escolha) {
                case 1:
                    Diretor.adicinarProfessor();
                    break;

                case 2:
                    Diretor.editarProfessor();
                    break;

                case 3:
                    Diretor.excluirProfessor();
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
                    Diretor.verDesempenhoProfessor();
                    break;

                case 8:
                    Diretor.verMelhoresAlunos();
                    break;

                case 9:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

    public static void menuPrincipalProf() {
        int escolha;
        System.out.println("Bem vindo, Professor(a)! \n O que deseja fazer?");
        System.out.println("1- Adicinar Aluno \n2- Editar Aluno \n3- Excluir Aluno \n4- Listar suas Turmas \n5- Sair");
        escolha = scanner.nextInt();

        while (escolha != 5) {

            switch (escolha) {
                case 1:
                    Professor.adicionarAluno();;
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
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    }

    static void menuPrincipalAluno() {
        System.out.println("Bem vindo ao menu de Aluno!");
    }

}
