package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicios_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
int N, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Entre com o número: ");
			N = ler.nextInt();
			soma +=N;
			
		}while(N != 0);
		
		System.out.println("\nA somatória dos valores digitados são: "+soma);

	}

	
}

		