package dominio;

public class Diretor extends Funcionario {
	private float bonificacao;
	
	public Diretor(){
		
	}
	
	public Diretor(String nome, String cpf, int matr, float salario, float bonificacao){
		super(nome,cpf,matr,salario);
		this.bonificacao = bonificacao;
	}
	
	public float getBonificacao(){
		return this.bonificacao;
	}
	
	public void setBonificacao(float bonificacao){
		this.bonificacao = bonificacao;
	}
	
	//método para pegar o salário completo do diretor
	public float getSalario(){
		return super.getSalario() + this.bonificacao;
	}

}
