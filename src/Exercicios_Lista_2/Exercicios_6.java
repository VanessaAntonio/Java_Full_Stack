package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicios_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
	 * Para sair digitar 0(zero).(DO...WHILE)
	 */

int x=1, N, multiplo=0, soma=0, media=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com o n�mero: ");
			N = ler.nextInt();
			if(N != 0) {
				multiplo = N*3;
				soma +=multiplo;
				media = soma/x;
				x++;
			}
			
			
		}while(N != 0);
		
		
		
		System.out.println("\nA m�dia dos m�ltiplos dos valores digitados �: "+media);


	}
}
