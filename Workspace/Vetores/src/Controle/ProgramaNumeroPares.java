package Controle;

import java.util.Scanner;

public class ProgramaNumeroPares {

	/*
	// Faça um programa que guarde em um vetor um 
	//conjunto de 10 inteiros digitados pelo usuário. Depois 
	//o programa deve ler o vetor e imprimir todos os 
	//números pares. 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] usuario = new int[10];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i< usuario.length; i++)
		{
			System.out.println("informe um numero");
			usuario[i] = input.nextInt();
		}
		
		for(int i = 0; i < usuario.length; i++)
		{
			if(usuario[i] % 2 == 0 )
				System.out.println(usuario[i]);
		}
		
		
	}

}
