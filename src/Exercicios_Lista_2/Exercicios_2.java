package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicios_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)


int N, par=0, impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Digite o "+i+"º número: ");
			System.out.println("\nEntre com o número: ");
			N = ler.nextInt();
			if(N%2==0) {
				par++;
			}
			else {
				impar++;
			}			
		}
		System.out.println("\nA quantidade de números pares informados é: "+par+" e números ímpares: "+impar);

	}
}
