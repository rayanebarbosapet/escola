package com.escola.escola.entities;

import java.util.ArrayList;
import java.util.Scanner;

import com.escola.escola.Menu;

import lombok.Data;

@Data
public class Professor extends Funcionario {
    private static Scanner scfloat = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);
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
   
    //   }
  

    public static void editarAluno() {
        listarAlunos();
        Turma novaTurma;
        String novoNome;
        int escolha = 0;
        int numeroAluno;
        Float nota1;
        Float nota2;
        Float nota3;
        System.out.println("qual aluno deseja editar?");
        numeroAluno = scannerInt.nextInt();
       
        while (escolha != 4) {
            
            System.out.println("o que deseja editar?");
            System.out.println(
                    "1- nome do aluno \n2- turma do aluno \n3- nota do aluno \n4- recuperação\n5- Sair");
            
            escolha = scannerInt.nextInt();
            

            switch (escolha) {
                case 1:
                System.out.println("qual o novo nome?");
                novoNome = scannerString.nextLine();
                Aluno.listaDeAluno.get(numeroAluno).setNome(novoNome);
                break;

                case 2:
                // System.out.println("qual a nova turma?");
                // novaTurma = sc.nextLine();
                // Aluno.listaDeAluno.get(numeroAluno).setTurma(novaTurma); 
                
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



         //  numeroAluno = parseInt(
    //     prompt("Informe o número aluno: \n\n\n" + listaCompleta)
    //   ); //pega o índice do aluno 
    //   let nota1 = parseFloat(prompt("Informe a primeira nota:")); // Lê nota 1
    //   let nota2 = parseFloat(prompt("Informe a segunda nota: ")); //Lê nota 2
    //   let media = (nota1 + nota2) / 2; //Calcula média automaticamente
    //   let status;
  
    //     //Diz se o aluno foi aprovado ou não de acordo com a média:
    //     //Menor que 5 é Reprovado, entre 5 e 7 está de Recuperação, maior que 7 está Aprovado
    //   if (media < 5) {
    //     status = "Reprovado";
    //   } else if (media >= 5 && media < 7) {
    //     status = "De Recuperação";
    //   } else {
    //     status = "Aprovado";

    }
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
