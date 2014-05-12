package Controle;

import java.util.Scanner;

public class excercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Complemente o programa anterior para imprimir os 
		nomes com 5 letras. Qual função de String calcula o 
		tamanho? 
		*/
		
		String[] nomes = new String[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < nomes.length ; i++)
		{
			System.out.println("informe o " + (i + 1) + " º nome");
			nomes[i] = input.nextLine();
		}
		
		for(int i = 0; i < nomes.length ; i ++)
		{
			if( nomes[i].startsWith("M")|| nomes[i].startsWith("m") )
			{
				if(nomes[i].length() == 5)
					System.out.println(nomes[i]);
			}
		}
				
	}

}
