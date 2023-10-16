package com.escola.escola.entities;

import java.util.Scanner;

import com.escola.escola.Menu;
import com.escola.escola.entities.Turma;

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
      /*  listarProfessores();
        Turma novaTurma ;
        String numeroDaTurma;
        String novoNome;
        int escolha = 0;
        int numeroDoProfessor;
        
     
        System.out.println("qual aluno deseja editar?");
      numeroDoProfessor = scannerInt.nextInt();
       
        while (escolha != 4) {
            
            System.out.println("o que deseja editar?");
            System.out.println(
                    "1- nome do professor \n2- turma do professor \n3- Sair");
            
            escolha = scannerInt.nextInt();
            

            switch (escolha) {
                case 1:
                System.out.println("qual o novo nome?");
                novoNome = scannerString.nextLine();
                Professor.listaDeProfessores.get(numeroDoProfessor).setNome(novoNome);
                break;
                case 2:
                 System.out.println("qual a nova turma?");
                 numeroDaTurma = scannerString.nextLine();
                 Professor.listaDeProfessores.get(numeroDoProfessor).setTurma
                
                break;

                case 3: 
                System.out.println("informe nota 01:");
                nota1 = scfloat.nextFloat();
                Aluno.listaDeAluno.get(numeroAluno).setNota1(nota1);

                System.out.println("informe nota 02:");
                nota2 = scfloat.nextFloat();
                Aluno.listaDeAluno.get(numeroAluno).setNota2(nota2);

               
                break;

                case 4:
                System.out.println("informe a nota de recuperação:");
                nota3 = scfloat.nextFloat();
                if ((Aluno.listaDeAluno.get(numeroAluno).getNota1()) > (Aluno.listaDeAluno.get(numeroAluno).getNota2()) ){
                    if ((Aluno.listaDeAluno.get(numeroAluno).getNota2()) < (nota3) ){
                        Aluno.listaDeAluno.get(numeroAluno).setNota2(nota3);
                    }
                }
                break;

                case 5:
                System.out.println("saindo");
                break;
                 default:
                 System.out.println("opção inválida");
                 break;

            }


        */ }

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
