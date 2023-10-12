package com.escola.escola.entities;

import java.util.Scanner;

import com.escola.escola.Menu;

public class Diretor extends Funcionario {
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);
    private static int numeroDoProfessor;

    public static void adicinarProfessor() {
        String nome;
        int numeroDaTurma;

        System.out.println("Informe o nome do professor que deseja adicionar:");
        nome = scannerString.nextLine();
        System.out.println("Em qual turma deseja adicioná-lo? ");
        Turma.listarTurmasExistentes();
        numeroDaTurma = scannerInt.nextInt();

        Professor novoProfessor = new Professor();
        novoProfessor.setNome(nome);
        novoProfessor.setTurma(Turma.listaDeTurmas.get(numeroDaTurma));
        Professor.listaDeProfessores.add(novoProfessor);

        System.out.println("Deseja adicionar outro professor? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            adicinarProfessor();
        } else {
            listarProfessores();
            Menu.menuPrincipalDiretor();
        }

    }

    public static void listarProfessores() {
        System.out.println("-----PROFESSORES-----");
        for (int i = 0; i < Professor.listaDeProfessores.size(); i++) {
            System.out.println(i + " - " + Professor.listaDeProfessores.get(i).getNome() + " - "
                    + Professor.listaDeProfessores.get(i).getTurma());
        }
        
    }

    public static void editarProfessor() {
        int escolha = 0;

        System.out.println("Qual professor deseja editar?");
        listarProfessores();
        numeroDoProfessor = scannerInt.nextInt();

        while (escolha != 4) {

            System.out.println("O que deseja fazer?");
            System.out.println(
                    "1- Excluir professor \n2- Ver desempenho professor \n3- voltar ");
            escolha = scannerInt.nextInt();

            switch (escolha) {
                case 1:
                    excluirProfessor();

                    break;

                case 2:
                    verDesempenhoProfessor();
                    break;

                case 3:
                    Menu.menuPrincipalDiretor();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }

    public static void excluirProfessor() {
        listarProfessores();
        int numeroDoProfessor;
        System.out.println("Informe o número do professor que deseja excluir: ");
        numeroDoProfessor = scannerInt.nextInt();
        for (int i = 0; i < Professor.listaDeProfessores.size(); i++) {
            if (i == numeroDoProfessor) {
                Professor.listaDeProfessores.remove(numeroDoProfessor);
            }

        }

        System.out.println("-----LISTA ATUALIZADA-----");

        listarProfessores();
    }

    public static void adicinarTurma() {
        String nome;

        System.out.println("Informe o nome da turma que deseja adicionar:");
        nome = scannerString.nextLine();

        Turma novaTurma = new Turma();
        novaTurma.setNome(nome);
        Turma.listaDeTurmas.add(novaTurma);

        System.out.println("Deseja adicionar outra turma? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            adicinarTurma();
        } else {
            Turma.listarTurmasExistentes();
        }

    }

    public static void editarTurma() {
        String novoNome;
        int numeroDaTurma;

        Turma.listarTurmasExistentes();
        System.out.println("Informe o número da turma que deseja editar: ");
        numeroDaTurma = scannerInt.nextInt();
        System.out.println("Informe o novo nome da turma: ");
        novoNome = scannerString.nextLine();

        Turma.listaDeTurmas.get(numeroDaTurma).setNome(novoNome);
    }

    public static void excluirTurma() {

        int numeroDaTurma;

        Turma.listarTurmasExistentes();
        System.out.println("Informe o número da turma que deseja excluir: ");
        numeroDaTurma = scannerInt.nextInt();
        Turma.listaDeTurmas.remove(numeroDaTurma);
    }

    public static void verDesempenhoProfessor() {
        // Criar métrica para medir desempenho do professor
    }

    public static void verMelhoresAlunos() {

        Aluno variavelAuxiliar = new Aluno();

        Aluno.calcularMedia();

        // Bubblesort de alunos com as melhores médias
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            for (int j = 0; j < (Aluno.listaDeAluno.size()) - 1; j++) {
                if (Aluno.listaDeAluno.get(j).getMedia() < Aluno.listaDeAluno.get(j + 1).getMedia()) {
                    variavelAuxiliar = Aluno.listaDeAluno.get(j);
                    Aluno.listaDeAluno.set(j, Aluno.listaDeAluno.get(j + 1));
                    Aluno.listaDeAluno.set(j + 1, variavelAuxiliar);
                }
            }
        }

        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("Top 3 - Alunos com as melhores médias");

        if (Aluno.listaDeAluno.get(0).getMedia() == 0) {
            System.out.println("1° - Não há aluno elegível para esta posição");
        } else {
            System.out.println("1° - " + Aluno.listaDeAluno.get(0).getNome() + " | Média: "
                    + Aluno.listaDeAluno.get(0).getMedia());
        }

        if (Aluno.listaDeAluno.get(1).getMedia() == 0) {
            System.out.println("2° - Não há aluno elegível para esta posição");
        } else {
            System.out.println(
                    "2° - " + Aluno.listaDeAluno.get(1).getNome() + " | Média: "
                            + Aluno.listaDeAluno.get(1).getMedia());
        }

        if (Aluno.listaDeAluno.get(2).getMedia() == 0) {
            System.out.println("3° - Não há aluno elegível para esta posição");

        } else {

            System.out.println(
                    "3° - " + Aluno.listaDeAluno.get(2).getNome() + " | Média: "
                            + Aluno.listaDeAluno.get(2).getMedia());
        }

        System.out.println("\n-------------------------------------------------------------\n");
    }
}
