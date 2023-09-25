package com.escola.escola.entities;

import java.util.ArrayList;
import java.util.Scanner;

import com.escola.escola.Menu;

import lombok.Data;

@Data
public class Professor extends Funcionario {
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);
    static ArrayList<Professor> listaDeProfessores = new ArrayList<>();

    public static void adicionarAluno() {
        String nome;
        String cpf;

        System.out.println("Informe o nome do aluno que deseja adicionar:");
        nome = scannerString.nextLine();
        System.out.println("Informe o cpf: ");
        cpf = scannerString.nextLine();

        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nome);
        novoAluno.setCpf(cpf);
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

    public static void listarAlunos() {
        System.out.println("-----------------------------------\n ALUNOS\n");
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            System.out.println(i + "- " + Aluno.listaDeAluno.get(i).getNome());
        }
    }

    public static void editarAluno() {

    }

    public static void excluirAluno(){
        listarAlunos();
        int numeroDoAluno;
        System.out.println("Informe o número do aluno que deseja excluir: ");
        numeroDoAluno = scannerInt.nextInt();
        for (int i = 0; i < Aluno.listaDeAluno.size(); i++) {
            if (i ==numeroDoAluno) {
                Aluno.listaDeAluno.remove(numeroDoAluno);
            }

        }

    }

    public static void listarTurma(){
        
    }

}
