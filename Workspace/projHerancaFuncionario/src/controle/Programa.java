package controle;

import dominio.Funcionario;
import face.Menu;

public class Programa {

	public static void main(String[] args) {
		/*Funcionario f1 = new Funcionario("José","1234",1,1000f);
		System.out.println("Nome: " + f1.getNome());
		Diretor d1 = new Diretor("Paulo","5467",2,2000f,200f);
		System.out.println("Nome do diretor:" + d1.getNome());
		Vendedor v1 = new Vendedor("Joao","9857",3,1000f,30f);
		System.out.println("Nome de Vendedor: " + v1.getNome());*/
		
		Menu telaPrincipal = new Menu();
		telaPrincipal.setVisible(true);
		
		/*
		CtrlFuncionario ctrlF = new CtrlFuncionario();
		String msg = ctrlF.inserirFuncionario("Paulo","5467",2,2000f,200f,"diretor");
		System.out.println(msg);
		msg = ctrlF.inserirFuncionario("João","9857",3,1000f,30f,"vendedor");
		System.out.println(msg);
		
		Funcionario[] vet = ctrlF.getVetFuncionarios();
		for (int i=0;i<vet.length;i++){
			if (vet[i] != null){
			  System.out.println("Nome: " + vet[i].getNome());
			  System.out.println("Salario: " + vet[i].getSalario());
			}
		}
		
		 */
	}

}
