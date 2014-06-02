package controle;

import dominio.Diretor;
import dominio.Funcionario;
import dominio.Vendedor;

public class CtrlFuncionario {
   private Funcionario[] vetFuncionarios;
   private int posicaoUltimo;
   
   public CtrlFuncionario(){
	   vetFuncionarios = new Funcionario[20];
	   posicaoUltimo = 0;
   }
   
   public String inserirFuncionario(String nome,String cpf,int matr,float salario, float bonus, String cargo){
	   for (int i=0;i<this.vetFuncionarios.length;i++){
		   if (this.vetFuncionarios[i] == null){
			  if (cargo.equals("vendedor")){ 
			    this.vetFuncionarios[i] = new Vendedor(nome,cpf,matr,salario,bonus);
			    posicaoUltimo++;
			    return "Vendedor inserido com sucesso!";
			  }
			  else{
				  this.vetFuncionarios[i] = new Diretor(nome,cpf,matr,salario,bonus);
				    posicaoUltimo++;
				  return "Diretor inserido com sucesso!";
			  }
		   }
	   }
	   return "vetor lotado!";
   }
   
   public Funcionario[] getVetFuncionarios(){
	   //temporário. Não está totalmente certo. Deveria retornar uma cópia
	   return this.vetFuncionarios;
   }
   
   public Funcionario getUltimoFuncionario(){
	   return vetFuncionarios[posicaoUltimo -1];
   }
   
}
