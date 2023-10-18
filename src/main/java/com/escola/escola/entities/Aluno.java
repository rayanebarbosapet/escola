package com.escola.escola.entities;

import java.util.ArrayList;
import java.util.Scanner;

import com.escola.escola.Login;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Aluno extends Pessoa {
    private String login;
    private String senha;

    private Double nota1;
    private Double nota2;
    private Double media;
    private int numerodeFaltas;
    private String status;
    private Turma turma;
    public static ArrayList<Aluno> listaDeAluno = new ArrayList<>();

    public static void calcularMedia() {
        Double mediaCalculada;

        for (int i = 0; i < listaDeAluno.size(); i++) {
            try {
                if (listaDeAluno.get(i).getNota1() == null) {
                    listaDeAluno.get(i).nota1 = 0.0; // Substitua nota1 por 0 se for nula
                }

                if (listaDeAluno.get(i).getNota2() == null) {
                    listaDeAluno.get(i).nota2 = 0.0; // Substitua nota2 por 0 se for nula
                }

                mediaCalculada = (listaDeAluno.get(i).getNota1() + listaDeAluno.get(i).getNota2()) / 2;
                listaDeAluno.get(i).media = mediaCalculada;
            } catch (NullPointerException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }


    public static void inserirEndereco() {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Professor.listarAlunos();
        System.out.println("Qual aluno deseja editar?");
        int numeroDoAluno = sc2.nextInt();

        
        System.out.println("Informe seu cep:");
        String cep = sc.nextLine();

        listaDeAluno.get(numeroDoAluno).setEndereco(Endereco.getEnderecoByCep(cep));

        //Endereco endereco = Endereco.getEnderecoByCep(cep);
        System.out.println("Rua: " +   listaDeAluno.get(numeroDoAluno).getEndereco().getLogradouro());
        System.out.println("Bairro: " + listaDeAluno.get(numeroDoAluno).getEndereco().getBairro());
        System.out.println("Cidade: " + listaDeAluno.get(numeroDoAluno).getEndereco().getLocalidade());
        System.out.println("Estado: " + listaDeAluno.get(numeroDoAluno).getEndereco().getUf());

        System.out.println("Número: ");
        String numero = sc.nextLine();
        listaDeAluno.get(numeroDoAluno).getEndereco().setNumero(numero);

        System.out.println("Complemento: ");
        String complemento = sc.nextLine();
        listaDeAluno.get(numeroDoAluno).getEndereco().setComplemento(complemento);
        sc.close();

        verFichaCompleta();

    }

    public static void verFichaCompleta(){

        for (int i = 0; i<listaDeAluno.size(); i++){
            System.out.println("------------FICHA COMPLETA-----------------");
        System.out.println("Aluno: " + listaDeAluno.get(i).getNome()); //Mapear pelo indice o aluno no login
        System.out.println("Turma: " + listaDeAluno.get(i).getTurma());
        System.out.println("Nota 1: " + listaDeAluno.get(i).getNota1() + "| Nota 2: ");
        System.out.println("Endereço: " + listaDeAluno.get(i).getEndereco());
    }

}
public static void verFalta(){

           

          for (int i = 0; i<listaDeAluno.size(); i++){  
           

         System.out.println(listaDeAluno.get(i).getNumerodeFaltas());

            
       

}
}
}




