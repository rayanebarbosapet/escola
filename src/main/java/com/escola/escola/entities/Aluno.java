package com.escola.escola.entities;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Aluno extends Pessoa {

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

        for (int i = 0; i < listaDeAluno.size(); i++) {
            if (listaDeAluno.get(i).getMedia() < 5) {
                listaDeAluno.get(i).setStatus("Reprovado");
            } else {
                listaDeAluno.get(i).setStatus("Aprovado");
            }
        }
    }

    public static void inserirEndereco(int numeroDoAluno) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Informe seu cep:");
        String cep = sc.nextLine();

        listaDeAluno.get(numeroDoAluno).setEndereco(Endereco.getEnderecoByCep(cep));

        // Endereco endereco = Endereco.getEnderecoByCep(cep);
        System.out.println("Rua: " + listaDeAluno.get(numeroDoAluno).getEndereco().getLogradouro());
        System.out.println("Bairro: " + listaDeAluno.get(numeroDoAluno).getEndereco().getBairro());
        System.out.println("Cidade: " + listaDeAluno.get(numeroDoAluno).getEndereco().getLocalidade());
        System.out.println("Estado: " + listaDeAluno.get(numeroDoAluno).getEndereco().getUf());

        System.out.println("Informe o Número: ");
        String numero = sc.nextLine();
        listaDeAluno.get(numeroDoAluno).getEndereco().setNumero(numero);

        System.out.println("Informe o Complemento: ");
        String complemento = sc.nextLine();
        listaDeAluno.get(numeroDoAluno).getEndereco().setComplemento(complemento);

    }

    public static void verFichaCompleta(int index) {

        calcularMedia();

        // Mapear pelo indice o aluno no login

        System.out.println("------------FICHA COMPLETA-----------------");
        System.out.println(
                "Aluno: " + listaDeAluno.get(index).getNome() + " | Turma: " + listaDeAluno.get(index).getTurma().getNome());
        System.out.println(
                "Nota 1: " + listaDeAluno.get(index).getNota1() + "| Nota 2: " + listaDeAluno.get(index).getNota2());
        System.out.println(
                "Média: " + listaDeAluno.get(index).getMedia() + " | Status: " + listaDeAluno.get(index).getStatus());
        System.out.println("Número de Faltas: " + listaDeAluno.get(index).getNumerodeFaltas());
        System.out.println("---------------------------------------------------------");
        System.out.println("Endereço: ");

        try {
            // Tente acessar um atributo que pode ser nulo
            System.out.println("Rua: " + listaDeAluno.get(index).getEndereco().getLogradouro() + ", nº: "
                    + listaDeAluno.get(index).getEndereco().getNumero());
            System.out.println("Complemento: " + listaDeAluno.get(index).getEndereco().getComplemento());
            System.out.println("Bairro: " + listaDeAluno.get(index).getEndereco().getBairro());
            System.out.println("Cidade: " + listaDeAluno.get(index).getEndereco().getLocalidade());
            System.out.println("Estado: " + listaDeAluno.get(index).getEndereco().getUf());

        } catch (NullPointerException e) {
            // Lidar com o atributo nulo
            System.out.println("O endereço não foi preenchido.");
        }

    }

}
