package Controle;

import Dominio.Aluno;

public class CtrlAluno {

	private Aluno[] vetAlunos;
	private int quantidadeAluno;
	
	public CtrlAluno()
	{
		/*Em que momento devemos alocar mem�ria para este vetor? Aonde estar� 
		a declara��o que aloca mem�ria?*/
		vetAlunos = new Aluno[10];
		quantidadeAluno = 0;
	}
	
	public String inserirAluno(String nome, int matricula)
	{
		if(quantidadeAluno == vetAlunos.length)
		{
			return "Vetor Lotado";
		}
		
		for(int i = 0; i < quantidadeAluno ; i ++)
		{
			if(vetAlunos[i].getMatricula() == matricula)
				return "Aluno j� existente";
		}
		
		Aluno aluno = new Aluno(nome,matricula);
		vetAlunos[quantidadeAluno] = aluno;
		quantidadeAluno++;
		
		return "Aluno inserido com sucesso";
	}
	
	public int BuscarMatricula(String nome)
	{
		for(int i = 0; i < quantidadeAluno ; i ++)
		{
			//metodo compara��o de String vetAlunos[i].getNome().equals(nome);
			if(vetAlunos[i].getNome().equals(nome) )
				return vetAlunos[i].getMatricula();
		}
		return  0;
	}
}
