package Controle;

import java.util.Scanner;

public class ProgramaLeituraNome {
	/*Faça um programa que guarde em um vetor um 
	conjunto de 5 nomes digitados pelo usuário. Depois o 
	programa deve ler o vetor e imprimir todos os nomes 
	que começam com a letra M. Use a função charAt da 
	classe String. 
	*/
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i < nomes.length ; i++)
		{
			System.out.println("informe o " + (i + 1) + " º nome");
			nomes[i] = input.nextLine();
		}
		
		for(int i = 0; i < nomes.length ; i ++)
		{
			if( nomes[i].startsWith("maria")|| nomes[i].startsWith("Maria") )
			{
				System.out.println(nomes[i]);
			}
		}
	}
}
