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
                    + Professor.listaDeProfessores.get(i).getTurma().getNome());
        }

    }

    public static void editarProfessor() {

        System.out.println("O que deseja editar");
        System.out.println("1- Editar nome do professor \n2- Trocar turma do professor \n3- Voltar ao menu do Diretor");
        int escolha = scannerInt.nextInt();

        switch (escolha) {
            case 1:
                trocarNomeDoProfessor();
                break;

            case 2:
                trocarProfessorDaTurma();
                break;

            case 3:
                System.out.println("Voltando ao menu do diretor");

                Menu.menuPrincipalDiretor();
                break;
            default:
                System.out.println("Opção inválida");
                break;
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
            Menu.menuPrincipalDiretor();
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
        System.out.println("Turma editada com sucesso");
        System.out.println("Deseja editar outra turma? (s/n)");
        String escolha = scannerString.nextLine();
        if(escolha.equals("s" )|| escolha.equals("S")){
            excluirTurma();
        } else{
            Menu.menuPrincipalDiretor();
        }
    }

    public static void excluirTurma() {

        int numeroDaTurma;

        Turma.listarTurmasExistentes();
        System.out.println("Informe o número da turma que deseja excluir: ");
        numeroDaTurma = scannerInt.nextInt();
        Turma.listaDeTurmas.remove(numeroDaTurma);
        System.out.println("Turma excluída com sucesso");
        System.out.println("Deseja excluir outra turma? (s/n)");
        String escolha = scannerString.nextLine();
        if(escolha.equals("s" )|| escolha.equals("S")){
            excluirTurma();
        } else{
            Menu.menuPrincipalDiretor();
        }
    }

    public static void verDesempenhoProfessor() {
        Professor variavelAuxiliar = new Professor();
        Professor.calcularMediaDoProfessor();

        // Bubblesort lista de professores cuja as turmas tiveram as melhores médias

        for (int i = 0; i < Professor.listaDeProfessores.size(); i++) {
            for (int j = 0; j < (Professor.listaDeProfessores.size() - 1); j++) {
                if (Professor.listaDeProfessores.get(j).getSomaDaMediaDasTurmas() < Professor.listaDeProfessores
                        .get(j + 1).getSomaDaMediaDasTurmas()) {
                    variavelAuxiliar = Professor.listaDeProfessores.get(j);
                    Professor.listaDeProfessores.set(j, Professor.listaDeProfessores.get(j + 1));
                    Professor.listaDeProfessores.set(j + 1, variavelAuxiliar);
                }

            }
        }

        System.out.println("-----RANKING DE PROFESSORES-----");
        for (int l = 0; l < Professor.listaDeProfessores.size(); l++) {
            System.out.println((l + 1) + "º - " + Professor.listaDeProfessores.get(l).getNome()
                    + " | Média das Turmas: " + Professor.listaDeProfessores.get(l).getSomaDaMediaDasTurmas());
        }

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

    public static void trocarNomeDoProfessor() {
        listarProfessores();

        System.out.println("Digite o número do professor que deseja alterar o nome:");
        int numeroDoProfessor = scannerInt.nextInt();

        System.out.println("Digite o novo nome do professor");
        String novoNome = scannerString.nextLine();

        Professor.listaDeProfessores.get(numeroDoProfessor).setNome(novoNome);

        System.out.println("Nome do professor alterado com sucesso!");

        System.out.println("Deseja trocar o nome de mais algum professor? (s/n)");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s") || escolha.equals("S")) {
            trocarNomeDoProfessor();
        } else {
            Menu.menuPrincipalDiretor();
        }
    }

    public static void trocarProfessorDaTurma() {

        // Exiba a lista de professores para escolher um novo professor
        listarProfessores();
        ;
        System.out.println("Informe o número do professor:");
        int numeroDoProfessor = scannerInt.nextInt();

        // Verifique se o número do professor é válido
        if (numeroDoProfessor >= 0 && numeroDoProfessor < Professor.listaDeProfessores.size()) {
            Turma.listarTurmasExistentes();
            System.out.println("Informe o número da turma para a qual deseja trocar o professor:");
            int numeroDaTurma = scannerInt.nextInt();
            // Verifique se o número da turma é válido
            if (numeroDaTurma >= 0 && numeroDaTurma < Turma.listaDeTurmas.size()) {
                Professor.listaDeProfessores.get(numeroDoProfessor).setTurma(Turma.listaDeTurmas.get(numeroDaTurma));
                System.out.println("Professor transferido com sucesso");

            } else {
                System.out.println("Número de turma inválido. Tente novamente.");

            }
        } else {
            System.out.println("Número de professor inválido. Tente novamente.");
        }

        System.out.println("Deseja trocar mais algum professor de turma? (s/n)");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s") || escolha.equals("S")) {
            trocarProfessorDaTurma();
        } else {
            Menu.menuPrincipalDiretor();
        }
    }

}