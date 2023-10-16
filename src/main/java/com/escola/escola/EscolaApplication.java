package com.escola.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import com.escola.escola.entities.Endereco;


@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);

		Scanner sc = new Scanner(System.in);
		// Aluno aluno1 = new Aluno();
		// aluno1.setNome("Rayane");

		// Aluno aluno2 = new Aluno();
		// aluno2.setNome("Danielle");

		// Aluno aluno3 = new Aluno();
		// aluno3.setNome("Duda");

		// Aluno.getListaAluno().add(aluno1);
		// Aluno.getListaAluno().add(aluno2);
		// Aluno.getListaAluno().add(aluno3);

		// Menu.menuPrincipalProf(); 
		//Login.inicio();
		
		System.out.println("Qual seu cep");
		String cep =  sc.nextLine();

			

	 Endereco endereco = Endereco.getEnderecoByCep(cep);
	 System.out.println("Rua: " + endereco.getLogradouro());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getLocalidade());
		System.out.println("Estado: " + endereco.getUf());

		System.out.println("Número: ");
		String numero = sc.nextLine();
		endereco.setNumero(numero);

		System.out.println("Complemento: ");
		String complemento = sc.nextLine();
		endereco.setComplemento(complemento);
		
	}
 
}
