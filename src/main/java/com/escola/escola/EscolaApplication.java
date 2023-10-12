package com.escola.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.escola.escola.entities.Aluno;
import com.escola.escola.entities.Diretor;
import com.escola.escola.entities.Professor;
import com.escola.escola.entities.Turma;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);

		// Intâncias de Diretores
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Alvo");

		// Intâncias de Turmas
		Turma turma1 = new Turma();
		turma1.setNome("Lufa-Lufa");

		Turma turma2 = new Turma();
		turma2.setNome("Corvinal");

		Turma turma3 = new Turma();
		turma3.setNome("Sonserina");

		Turma turma4 = new Turma();
		turma4.setNome("Grifinória");

		Turma.listaDeTurmas.add(turma1);
		Turma.listaDeTurmas.add(turma2);
		Turma.listaDeTurmas.add(turma3);
		Turma.listaDeTurmas.add(turma4);

		// Instâncias de Professores
		Professor professor1 = new Professor();
		professor1.setNome("Pomona Sprout");
		professor1.setTurma(turma1);

		Professor professor2 = new Professor();
		professor2.setNome("Filio Flitwick");
		professor2.setTurma(turma2);

		Professor professor3 = new Professor();
		professor3.setNome("Severo Snape");
		professor3.setTurma(turma3);

		Professor professor4 = new Professor();
		professor4.setNome("Minerva McGonagall");
		professor4.setTurma(turma4);

		Professor.listaDeProfessores.add(professor1);
		Professor.listaDeProfessores.add(professor2);
		Professor.listaDeProfessores.add(professor3);
		Professor.listaDeProfessores.add(professor4);


		// Instâncias de Aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rayane");
		aluno1.setTurma(turma2);

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Danielle");
		aluno2.setTurma(turma1);

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Duda");
		aluno3.setTurma(turma3);

		Aluno aluno4 = new Aluno();
		aluno4.setNome("Silvia");
		aluno4.setTurma(turma4);

		Aluno aluno5 = new Aluno();
		aluno5.setNome("Roberta");
		aluno5.setTurma(turma4);

		Aluno aluno6 = new Aluno();
		aluno6.setNome("Newt");
		aluno6.setTurma(turma1);

		Aluno aluno7 = new Aluno();
		aluno7.setNome("Luna");
		aluno7.setTurma(turma2);

		Aluno aluno8 = new Aluno();
		aluno8.setNome("Scorpius");
		aluno8.setTurma(turma3);

		Aluno aluno9 = new Aluno();
		aluno9.setNome("Wade");
		aluno9.setTurma(turma1);

		Aluno aluno10 = new Aluno();
		aluno10.setNome("Garrick");
		aluno10.setTurma(turma2);

		Aluno aluno11 = new Aluno();
		aluno11.setNome("Merlin");
		aluno11.setTurma(turma3);

		Aluno aluno12 = new Aluno();
		aluno12.setNome("Nicholas");
		aluno12.setTurma(turma4);

		Aluno.listaDeAluno.add(aluno1);
		Aluno.listaDeAluno.add(aluno2);
		Aluno.listaDeAluno.add(aluno3);
		Aluno.listaDeAluno.add(aluno4);
		Aluno.listaDeAluno.add(aluno5);
		Aluno.listaDeAluno.add(aluno6);
		Aluno.listaDeAluno.add(aluno7);
		Aluno.listaDeAluno.add(aluno8);
		Aluno.listaDeAluno.add(aluno9);
		Aluno.listaDeAluno.add(aluno10);
		Aluno.listaDeAluno.add(aluno11);
		Aluno.listaDeAluno.add(aluno12);

		Login.inicio();
		//Diretor.adicinarProfessor();

		//Professor.imprimirStatusDosAlunos();

	}

}
