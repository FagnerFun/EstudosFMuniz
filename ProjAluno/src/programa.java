import java.util.Scanner;


public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno[] alunos = new Aluno[10];
		Scanner input = new Scanner(System.in);
		
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
		}
	}

}
