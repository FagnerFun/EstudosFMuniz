package dominio;

//Funcionario herda de Pessoa
public class Funcionario extends Pessoa {

	private int matr;
	private float salario;
	
	public Funcionario()
	{
		
	}
	
	public Funcionario(String nome,String cpf,int matr,float salario){
		super(nome,cpf);
		this.matr = matr;
		this.salario = salario;
	}
	
	public int getMatr(){
		return this.matr;
	}
	
	public float getSalario(){
		return this.salario;
	}
	
	public void setMatr(int matr){
		this.matr = matr;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
}
