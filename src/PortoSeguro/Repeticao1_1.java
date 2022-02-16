package PortoSeguro;

import java.util.Scanner;

public class Repeticao1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, media,somaMedia=0, mediaGeral = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=1;x<=5;x++)
		{
			System.out.println("\n Notas do aluno "+x+" :");
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3) / 3;
			
			somaMedia = somaMedia + media;
			
			mediaGeral = somaMedia / x;
		}
	
		
		System.out.printf("\n Media geral: %2.2f", mediaGeral);
	}

}

