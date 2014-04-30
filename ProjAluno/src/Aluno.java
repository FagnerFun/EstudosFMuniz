
public class Aluno {
	private String nome;
	private int matricula;
	
	public Aluno()
	{
	}
	
	public Aluno(String nome, int matricula)
	{
		setNome(nome);
		setMatricula(matricula);
	}
	
	public void setNome(String nome)
	{
		if (nome != "")
			this.nome = nome;
	}
	
	public void setMatricula(int matricula)
	{
		if (matricula > 0)
			this.matricula = matricula;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public int getMatricula()
	{
		return matricula;
	}
	
	
	public String retornaDados()
	{
		return "nome: "+ this.nome + ", matricula: " + this.matricula; 
	}
}
