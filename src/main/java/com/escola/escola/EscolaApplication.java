package com.escola.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.escola.escola.entities.Aluno;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rayane");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Danielle");

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Duda");

		Aluno.getListaAluno().add(aluno1);
		Aluno.getListaAluno().add(aluno2);
		Aluno.getListaAluno().add(aluno3);

		Menu.menuPrincipalProf(); 
	}
 
}
