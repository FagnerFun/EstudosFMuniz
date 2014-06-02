package dominio;

public class Vendedor extends Funcionario{
	private float comissao;
	
	public Vendedor()
	{
		
	}
	
	public Vendedor(String nome,String cpf,int matr,float salario,float comissao){
		super(nome,cpf,matr,salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return this.comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
	

}
