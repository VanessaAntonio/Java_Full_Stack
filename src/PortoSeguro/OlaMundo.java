package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade= 26, x, y;
		double altura,nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Olá Mundo!!!");
				
		System.out.println("\n\t\t Entre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n\t\t Entre com a sua altura:");
		altura = leia.nextFloat();
		
		System.out.println("\nentre com a primeria nota:");
		nota1 =leia.nextFloat();
		
		System.out.println("\nentre com a primeria nota:");
		nota2 =leia.nextFloat();	
		
		System.out.println("\nentre com a primeria nota:");
		nota3 =leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.println("\nMenu nome é: " +nome+   "\t eu tenho: "+idade+
				"ano(s) e aminha altura é:" +altura);
		
		System.out.printf("\nMedia aritiméica: %2.2f",media);
		
		nota1 = Math.sqrt(nota2);
		
		
}
}
