package com.escola.escola;

import java.util.Scanner;

import com.escola.escola.entities.Aluno;
import com.escola.escola.entities.Diretor;
import com.escola.escola.entities.Professor;

import lombok.Data;

@Data
public class Login {
    public static final boolean[] egualsIgnoreCase = null;
    private static String login;
    private static String senha = "123";
    private static int indexDeRastreamento;
    private static Scanner scannerString = new Scanner(System.in);
    private static Scanner scannerInt = new Scanner(System.in);

    public static void inicio() {
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Com qual perfil deseja logar?");
            System.out.println("1- Diretor(a) \n2- Professor(a) \n3- Aluno(a) \n4- Sair");

            opcao = scannerInt.nextInt();

            switch (opcao) {
                case 1:

                    login = "diretor";
                    if (fazerLogin()) {
                        Menu.menuPrincipalDiretor();
                    }
                    break;

                case 2:
                    loginDeProfessores();
                    break;

                case 3:
                    loginDeAlunos();
                    break;

                case 4:
                    System.out.println("Saindo do Sistema");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    inicio();
                    break;
            }
        }
    }

    private static boolean fazerLogin() {
        String loginDigitado;
        String senhaDigitada;

        System.out.println("Infome o login:");
        loginDigitado = scannerString.nextLine();
        System.out.println("Informe a senha:");
        senhaDigitada = scannerString.nextLine();

        if (login.equals(loginDigitado) && senha.equals(senhaDigitada)) {
            System.out.println("Login Realizado com sucesso");
            return true;

        } else if (!login.equals(loginDigitado) && !senha.equals(senhaDigitada)) {
            System.out.println("Tanto o login, quanto a senha estão incorretos.");
            return false;

        } else if (!senha.equals(senhaDigitada)) {
            System.out.println("Senha incorreta.");
            return false;

        } else if (!loginDigitado.equals(login)) {
            System.out.println("Login incorreta.");
            return false;
        }

        scannerString.close();
        return false;

    }

    public static void loginDeProfessores() {
        int numeroDoProfessor;

        Diretor.listarProfessores();
        System.out.println("Com qual perfil deseja logar?");
        numeroDoProfessor = scannerInt.nextInt();
        login = Professor.listaDeProfessores.get(numeroDoProfessor).getNome();

        if (fazerLogin()) {
            Menu.menuPrincipalProf();
        }
    }

    public static void loginDeAlunos() {
        int numeroDoAluno;
        Professor.listarAlunos();
        System.out.println("Com qual perfil deseja logar?");
        numeroDoAluno = scannerInt.nextInt();

        login = Aluno.listaDeAluno.get(numeroDoAluno).getNome();
        if (fazerLogin()) {
            System.out.println("Bem vindo, aluno (a)");
            System.out.println("Segue abaixo os dados referentes a sua matrícula.");
            Aluno.verFichaCompleta(numeroDoAluno);
            try {
                Thread.sleep(5000);
                System.out.println("Pressione 's' para sair");
                String saida = scannerString.nextLine();
                if (saida.equals("s") || saida.equals("S")) {
                    System.out.println("Saindo");
                    inicio();
                }
            } catch (InterruptedException e) {
                // Lida com exceção, se ocorrer
            }

        }

    }

}
