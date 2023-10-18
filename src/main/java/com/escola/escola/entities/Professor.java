package com.escola.escola.entities;

import java.util.ArrayList;
import java.util.Scanner;

import com.escola.escola.Menu;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Professor extends Funcionario {
    private Turma turma;
    private Double somaDaMediaDasTurmas = 0.0;
    public static ArrayList<Professor> listaDeProfessores = new ArrayList<>();

    private static int numeroDoAluno;
    private static Scanner scannerDouble = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);

    public static void calcularMediaDoProfessor() {

        Turma.calcularMediaDaTurma();

        for (int i = 0; i < listaDeProfessores.size(); i++) {
            for (int j = 0; j < Turma.listaDeTurmas.size(); j++) {
                if (listaDeProfessores.get(i).getTurma() == Turma.listaDeTurmas.get(j)) {
                    listaDeProfessores.get(i).somaDaMediaDasTurmas = listaDeProfessores.get(i).somaDaMediaDasTurmas
                            + Turma.listaDeTurmas.get(j).getSomaMediaAlunosDaTurma();
                }

            }

        }
    }

    public static void listarAlunos() {
        System.out.println("-----------------------------------\n ALUNOS\n");
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            System.out.println(i + "- " + Aluno.listaDeAluno.get(i).getNome());
        }

        System.out.println("-----------------------------------");
    }

    public static void adicionarAluno() {
        String nome;
        int numeroDaTurma;

        System.out.println("Informe o nome do aluno que deseja adicionar:");
        nome = scannerString.nextLine();
        System.out.println("Informe em qual turma deseja adicioná-lo:");
        Turma.listarTurmasExistentes();
        numeroDaTurma = scannerInt.nextInt();

        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nome);
        novoAluno.setTurma(Turma.listaDeTurmas.get(numeroDaTurma));
        Aluno.listaDeAluno.add(novoAluno);

        System.out.println("Aluno adicionado com sucesso!");
        System.out.println("Deseja adicionar outro aluno? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            adicionarAluno();
        } else {
            listarAlunos();
            Menu.menuPrincipalProf();
        }

    }

    public static void editarAluno() {
        int escolha = 0;

        System.out.println("Qual aluno deseja editar?");
        listarAlunos();

        numeroDoAluno = scannerInt.nextInt();

        while (escolha != 6) {

            System.out.println("O que deseja fazer?");
            System.out.println(
                    "1- Editar nome do aluno \n2- Trocar turma do aluno \n3- Adicionar faltas do aluno \n4- Adicionar nota de recuperação \n5- Inserir endereço do aluno \n6- Voltar para o menu principal");
            escolha = scannerInt.nextInt();

            switch (escolha) {
                case 1:
                    trocarNomeDoAluno();
                    break;

                case 2:
                    trocarTurmaDoAluno();
                    break;

                case 3:
                    adicionarFaltas();
                    break;

                case 4:
                    adicionarNotaDeRecuperacao();
                    break;

                case 5:
                    Aluno.inserirEndereco(numeroDoAluno);
                    System.out.println("Deseja editar outro aluno? s/n");
                    String opcao = scannerString.nextLine();

                    if (opcao.equals("s") || opcao.equals("S")) {
                        editarAluno();
                    } else {
                        listarAlunos();
                        Menu.menuPrincipalProf();
                    }
                    break;

                case 6:
                    Menu.menuPrincipalProf();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void excluirAluno() {
        listarAlunos();
        int numeroDoAluno;
        System.out.println("Informe o número do aluno que deseja excluir: ");
        numeroDoAluno = scannerInt.nextInt();
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            if (i == numeroDoAluno) {
                Aluno.listaDeAluno.remove(numeroDoAluno);
            }

        }

        System.out.println("Aluno excluído com sucesso!");
        System.out.println("Deseja excluir outro aluno? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            excluirAluno();
        } else {
            listarAlunos();
            Menu.menuPrincipalProf();
        }

    }

    public static void listarTurma() {
        System.out.println("Em construção");
        Menu.menuPrincipalProf();
        // System.out.println("Estas são as suas turmas:");
        // for(int i = 0; i < Turma.listaDeTurmas.size(); i++){
        // if(Turma.listaDeTurmas.get(i) ==
        // Professor.listaDeProfessores.get(i).getTurma()){
        // System.out.println(Turma.listaDeTurmas.get(i).getNome());
        // }
        // }
    }

    public static void trocarNomeDoAluno() {
        String novoNome;
        System.out.println("Qual o novo nome?");
        novoNome = scannerString.nextLine();
        Aluno.listaDeAluno.get(numeroDoAluno).setNome(novoNome);
        System.out.println(Aluno.listaDeAluno.get(numeroDoAluno).getNome());

        System.out.println("Nome do aluno editado com sucesso!");
        System.out.println("Deseja editar outro aluno? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            editarAluno();
        } else {

            Menu.menuPrincipalProf();
        }

    }

    public static void trocarTurmaDoAluno() {
        int numeroDaNovaTurma;
        Turma.listarTurmasExistentes();
        System.out.println("Para qual turma deseja mudar  aluno?");
        numeroDaNovaTurma = scannerInt.nextInt();
        Aluno.listaDeAluno.get(numeroDoAluno).setTurma(Turma.listaDeTurmas.get(numeroDaNovaTurma));
        System.out.println("Aluno: " + Aluno.listaDeAluno.get(numeroDaNovaTurma).getNome()
                + " |Nova Turma: " + Aluno.listaDeAluno.get(numeroDaNovaTurma).getTurma().getNome());

        System.out.println("Aluno movido de turma com sucesso!");
        System.out.println("Deseja editar outro aluno? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            editarAluno();
        } else {
            Menu.menuPrincipalProf();
        }

    }

    public static void adicionarNotas() {

        Double nota1;
        Double nota2;

        listarAlunos();
        System.out.println("Qual o número do aluno que deseja adicionar nota?");
        int numeroDoAluno = scannerInt.nextInt();

        System.out.println("Informe nota 01:");
        nota1 = scannerDouble.nextDouble();
        Aluno.listaDeAluno.get(numeroDoAluno).setNota1(nota1);

        System.out.println("Informe nota 02:");
        nota2 = scannerDouble.nextDouble();
        Aluno.listaDeAluno.get(numeroDoAluno).setNota2(nota2);

        System.out.println("Notas adicionadas com sucesso!");
        System.out.println("Deseja adicionar a nota de mais algum aluno?(s/n)");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s") || escolha.equals("S")) {
            adicionarNotas();
        } else {
            Menu.menuPrincipalProf();
        }
    }

    public static void adicionarFaltas() {
        int numeroDeFaltasAdicionais;
        int faltasJaRegistradas = Aluno.listaDeAluno.get(numeroDoAluno).getNumerodeFaltas();
        System.out.println("Quantas faltas deseja adicionar?");
        numeroDeFaltasAdicionais = scannerInt.nextInt();
        Aluno.listaDeAluno.get(numeroDoAluno).setNumerodeFaltas(faltasJaRegistradas + numeroDeFaltasAdicionais);
        System.out.println("Faltas adicionadas com sucesso!");
        System.out.println("Deseja editar outro aluno? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            editarAluno();
        } else {
            Menu.menuPrincipalProf();
        }

    }

    public static void adicionarNotaDeRecuperacao() {
        Double nota3;
        System.out.println("Informe a nota de recuperação:");
        nota3 = scannerDouble.nextDouble();

        if (Aluno.listaDeAluno.get(numeroDoAluno).getNota1() < Aluno.listaDeAluno.get(numeroDoAluno).getNota2()) {
            if (Aluno.listaDeAluno.get(numeroDoAluno).getNota1() < nota3) {
                Aluno.listaDeAluno.get(numeroDoAluno).setNota1(nota3);
                System.out.println("A nota 1 foi substituída pela nota de recuperação");
            } else {
                System.out.println(
                        "A nota de recuperação é menor do que as notas registradas, portanto não será substituída");
            }
        } else {
            if (Aluno.listaDeAluno.get(numeroDoAluno).getNota2() < nota3) {
                Aluno.listaDeAluno.get(numeroDoAluno).setNota2(nota3);
                System.out.println("A nota 2 foi substituída pela nota de recuperação");
            } else {
                System.out.println(
                        "A nota de recuperação é menor do que as notas registradas, portanto não será substituída");
            }
        }

        System.out.println("Deseja editar outro aluno? s/n");
        String escolha = scannerString.nextLine();

        if (escolha.equals("s")) {
            editarAluno();
        } else {
            Menu.menuPrincipalProf();
        }

    }

    public static void imprimirStatusDosAlunos() {

        Aluno.calcularMedia();
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            if (Aluno.listaDeAluno.get(i).getMedia() < 5) {
                Aluno.listaDeAluno.get(i).setStatus("Reprovado");
            } else {
                Aluno.listaDeAluno.get(i).setStatus("Aprovado");
            }

            System.out.println("Aluno: " + Aluno.listaDeAluno.get(i).getNome());
            System.out.println("Nota 1: " + Aluno.listaDeAluno.get(i).getNota1() + " | Nota 2: "
                    + Aluno.listaDeAluno.get(i).getNota2());// onde tem get(i) passaria a get(numeroDoAluno)
            System.out.println("Média Final: " + Aluno.listaDeAluno.get(i).getMedia() + " | Status: "
                    + Aluno.listaDeAluno.get(i).getStatus());
            System.out.println("\n ---------------------------------------------------------\n");

        }

    }
}
