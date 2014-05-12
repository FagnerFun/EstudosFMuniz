package Controle;
import java.util.Scanner;

import Dominio.Aluno;


public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Como testar esse método na classe Programa
		CtrlAluno controle = new CtrlAluno();
		
		String nome;
		int matricula;
		
		System.out.println("informe o nome do aluno");
		nome = input.nextLine();

		System.out.println("informe a matricula do aluno");
		matricula = input.nextInt();
		
		System.out.println( controle.inserirAluno(nome, matricula));
		
		//informei o nome do aluno
		System.out.println("informe o nome do aluno");
		nome = input.next();
		//busca o aluno baseado nome e retorna a matricula
		System.out.println( controle.BuscarMatricula(nome));
		
		/*
		Aluno patric = new Aluno("patric",000001);
		Aluno rodrigo = new Aluno("rodrigo",000002);
		
		alunos[0] = patric;
		alunos[1] = rodrigo;

		System.out.println(alunos[0].retornaDados());
		System.out.println(alunos[1].retornaDados());
		
		for(int i = 0;i<3;i++)
		{
			Aluno alunoTemp = new Aluno();
			
			System.out.println("informe o nome");
			alunoTemp.setNome(input.next());
			
			System.out.println("informe a matricula");
			alunoTemp.setMatricula(input.nextInt());
			
			alunos[i] = alunoTemp ;
			
		}
		
		for(int i = 0; i < 3 ; i++)
		{
			System.out.println("  " + alunos[i].getNome() + " matricula " + alunos[i].getMatricula()  );
		}*/
	}

}
