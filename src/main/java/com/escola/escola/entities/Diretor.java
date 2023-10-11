package com.escola.escola.entities;

import java.util.Scanner;

import com.escola.escola.Menu;

public class Diretor extends Funcionario {
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);

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

        //Bubblesort de alunos com as  melhores médias

    }
}
