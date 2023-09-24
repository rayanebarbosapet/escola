package com.escola.escola;

import java.util.Scanner;

import lombok.Data;

@Data
public class Login {
    private static String login;
    private static String senha;
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner sc = new Scanner(System.in);

    public static void inicio(){
        int opcao;
        System.out.println("Com qual perfil deseja logar?");
        System.out.println("1- Diretor(a) \n2- Professor(a) \n3- Aluno(a) \n4- Sair");
        opcao = sc.nextInt();

        while(opcao != 4){

        switch(opcao){
            case 1:
            login = "diretor";
            senha = "123";
            if(fazerLogin()){
                Menu.menuPrincipalDiretor();
            }
            break;

            case 2:
            login = "professor";
            senha = "456";
            if(fazerLogin()){
                Menu.menuPrincipalProf();
            }
            break;

            case 3:
            login = "aluno";
            senha = "789";
            if(fazerLogin()){
                Menu.menuPrincipalAluno();
            }
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
        sc.close();
    }
    }



    private static boolean fazerLogin(){
        String loginDigitado;
        String senhaDigitada;

        System.out.println("Infome o login:");
        loginDigitado = scanner.nextLine();
        System.out.println("Informe a senha:");
        senhaDigitada = scanner.nextLine();

        if(login.equals(loginDigitado) && senha.equals(senhaDigitada)){
            System.out.println("Login Realizado com sucesso");
            return true;

        } else if (!login.equals(loginDigitado) && !senha.equals(senhaDigitada)){
            System.out.println("Tanto o login, quanto a senha estão incorretos.");
            return false;  
            
        } else if (!senha.equals(senhaDigitada)){
            System.out.println("Senha incorreta.");
            return false;

        } else if (!loginDigitado.equals(login)){
            System.out.println("Login incorreta.");
            return false;
        }

        scanner.close();
        return false;
        
     }
    
}
