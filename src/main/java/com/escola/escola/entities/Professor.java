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
    public static ArrayList<Professor> listaDeProfessores = new ArrayList<>();

    private static int numeroDoAluno;
    private static Scanner scannerFloat = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);

    public static void listarAlunos() {
        System.out.println("-----------------------------------\n ALUNOS\n");
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            System.out.println(i + "- " + Aluno.listaDeAluno.get(i).getNome());
        }
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

        while (escolha != 4) {

            System.out.println("O que deseja fazer?");
            System.out.println(
                    "1- Editar nome do aluno \n2- Trocar turma do aluno \n3- Adicionar notas do aluno \n4- Adicionar faltas do aluno \n5- Adicionar nota de recuperação \n6- Ver status dos alunos \n7- Voltar para o menu principal");
            escolha = scannerInt.nextInt();

            switch (escolha) {
                case 1:
                    trocarNomeDoAluno();
                    break;

                case 2:
                    trocarTurmaDoAluno();
                    break;

                case 3:
                    adicionarNotas();
                    break;

                case 4:
                    adicionarFaltas();
                    break;

                case 5:
                    adicionarNotaDeRecuperacao();
                    break;

                case 6:
                    imprimirStatusDosAlunos();
                    break;

                case 7:
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

    }

    public static void listarTurma() {

        // etodo que olha o numero do index do professor e o da turma ; pegaria o index da turma e acharia os alunos
    System.out.println(Turma.listaDeTurmas);
    }

    public static void trocarNomeDoAluno() {
        String novoNome;
        System.out.println("Qual o novo nome?");
        novoNome = scannerString.nextLine();
        Aluno.listaDeAluno.get(numeroDoAluno).setNome(novoNome);

    }

    public static void trocarTurmaDoAluno() {
        int numeroDaNovaTurma;
        Turma.listarTurmasExistentes();
        System.out.println("Para qual turma deseja mudar  aluno?");
        numeroDaNovaTurma = scannerInt.nextInt();
        Aluno.listaDeAluno.get(numeroDoAluno).setTurma(Turma.listaDeTurmas.get(numeroDaNovaTurma));
    }

    public static void adicionarNotas() {
        Float nota1;
        Float nota2;

        System.out.println("Informe nota 01:");
        nota1 = scannerFloat.nextFloat();
        Aluno.listaDeAluno.get(numeroDoAluno).setNota1(nota1);

        System.out.println("Informe nota 02:");
        nota2 = scannerFloat.nextFloat();
        Aluno.listaDeAluno.get(numeroDoAluno).setNota2(nota2);
    }

    public static void adicionarFaltas() {
        int numeroDeFaltasAdicionais;
        int faltasJaRegistradas = Aluno.listaDeAluno.get(numeroDoAluno).getNumerodeFaltas();
        System.out.println("Quantas faltas deseja adicionar?");
        numeroDeFaltasAdicionais = scannerInt.nextInt();
        Aluno.listaDeAluno.get(numeroDoAluno).setNumerodeFaltas(faltasJaRegistradas + numeroDeFaltasAdicionais);

    }

    public static void adicionarNotaDeRecuperacao() {
        Float nota3;
        System.out.println("Informe a nota de recuperação:");
        nota3 = scannerFloat.nextFloat();

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

    }

    public static void imprimirStatusDosAlunos() {//passaria a imprimirStatusDoAluno
        Float media;

        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            media = (Aluno.listaDeAluno.get(i).getNota1() + Aluno.listaDeAluno.get(i).getNota2()) / 2;
            Aluno.listaDeAluno.get(i).setMedia(media);
            //tem que colocar a nota de todos os alunos, se não da erro. ele não divide por 2 nota null. da erro.
            //sugestão dois status um para todos os aluno que não divida por 2 e um para o aluno pesquisado.

            if (media < 5) {
                Aluno.listaDeAluno.get(i).setStatus("Reprovado");
            } else {
                Aluno.listaDeAluno.get(i).setStatus("Aprovado");
            }

            System.out.println("Aluno: " + Aluno.listaDeAluno.get(i).getNome());
            System.out.println("Nota 1: " + Aluno.listaDeAluno.get(i).getNota1() + " | Nota 2: "
                    + Aluno.listaDeAluno.get(i).getNota2());//onde tem get(i) passaria a get(numeroDoAluno)
            System.out.println("Média Final: " + Aluno.listaDeAluno.get(i).getMedia() + " | Status: "
                    + Aluno.listaDeAluno.get(i).getStatus());
                    //desde o começo do menu o get é "numeroDoAluno" e aqui esta como i o codigo quebra.
                    //eu acredito que como começamos com numeroDoAluno que a gente continue.

        }
    }

}
