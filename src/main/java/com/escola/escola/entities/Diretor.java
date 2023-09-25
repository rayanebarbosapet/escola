package com.escola.escola.entities;

import java.util.Scanner;

import com.escola.escola.Menu;

public class Diretor extends Funcionario {
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);

    public static void adicinarProfessor() {
        String nome;
        String cpf;

        System.out.println("Informe o nome do professor que deseja adicionar:");
        nome = scannerString.nextLine();
        System.out.println("Informe o cpf: ");
        cpf = scannerString.nextLine();

        Professor novoProfessor = new Professor();
        novoProfessor.setNome(nome);
        novoProfessor.setCpf(cpf);
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
        System.out.println("-----------------------------------\n PROFESSORES\n");
        for (int i = 0; i < Professor.listaDeProfessores.size(); i++) {
            System.out.println(i + "- " + Professor.listaDeProfessores.get(i).getNome());
        }

    }

    public static void editarProfessor() {

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
            listarTurma();
            Menu.menuPrincipalDiretor();
        }

    }

    public static void listarTurma() {
        System.out.println("-----------------------------------\n TURMAS\n");
        for (int i = 0; i < Turma.listaDeTurmas.size(); i++) {
            System.out.println(i + "- " + Turma.listaDeTurmas.get(i).getNome());
        }

    }

    public static void editarTurma() {
        String novoNome;
        int numeroDaTurma;

        listarTurma();
        System.out.println("Informe o número da turma que deseja editar: ");
        numeroDaTurma = scannerInt.nextInt();
        System.out.println("Informe o novo nome da turma: ");
        novoNome = scannerString.nextLine();

        for (int i = 0; i < Turma.listaDeTurmas.size(); i++) {
            if (i == numeroDaTurma) {
                Turma.listaDeTurmas.get(i).setNome(novoNome);
            }

        }
    }

    public static void excluirTurma() {
        listarTurma();
        int numeroDaTurma;
        System.out.println("Informe o número da turma que deseja excluir: ");
        numeroDaTurma = scannerInt.nextInt();
        for (int i = 0; i < Turma.listaDeTurmas.size(); i++) {
            if (i == numeroDaTurma) {
                Turma.listaDeTurmas.remove(numeroDaTurma);
            }

        }

    }

    public static void verDesempenhoProfessor() {
        // Criar métrica para medir desempenho do professor
    }

    public static void verMelhoresAlunos() {

    }
}
