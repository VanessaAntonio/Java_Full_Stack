package Exercicios_Lista_2;

import java.util.Scanner;

public class Exercicios_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
		 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		 
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.
*/

		int 	pessoas=1, sexo, psico, idade, calmos=0, 
				mulherNervosa=0, homemAgressivo=0, outroCalmo=0, 
				nervosoQuarenta=0, calmoDezoito=0;
		
		Scanner ler = new Scanner(System.in);
		while(pessoas<=150) {
			System.out.println("\nQuantidade de Entrevistados: "+pessoas);
			System.out.println("\nEntre com sua idade: ");
			idade = ler.nextInt();
			while(idade<0) {
				System.out.println("\nIdade inv�lida. Entre com a idade: ");
				idade = ler.nextInt();
			}
		
			System.out.println("\n1 - Feminino");
			System.out.println("\n2 - Masculino");
			System.out.println("\n3 - Outros");
			System.out.println("Qual seu sexo: ");
			sexo = ler.nextInt();			
			
			System.out.println("\n1 - Calmo");
			System.out.println("\n2 - Nervoso");
			System.out.println("\n3 - Agressivo");
			System.out.println("Qual seu estado psicol�gico: ");
			psico = ler.nextInt();
			
			if(psico == 1) {
				calmos++;
			}
			else if(sexo == 1 && psico == 2) {
				mulherNervosa++;
			}
			else if(sexo == 2 && psico == 3) {
				homemAgressivo++;
			}
			else if(sexo ==3 && psico == 1) {
				outroCalmo++;
			}
			else if(idade>40 && psico == 2) {
				nervosoQuarenta++;
			}
			else if(idade<18 && psico == 1) {
				calmoDezoito++;
			}		
			
			pessoas++;
		}
		System.out.println("\nN�mero de Pessoas Calmas: "+calmos);
		System.out.println("\nN�mero de Mulheres Nervosas:"+mulherNervosa);
		System.out.println("\nN�mero de Homens Agressivos: "+homemAgressivo);
		System.out.println("\nN�mero de Outros Calmos: "+outroCalmo);
		System.out.println("\nN�mero de pessoas nervosas acima de 40anos: "+nervosoQuarenta);
		System.out.println("\nN�mero de pessoas calmas menores de 18anos: "+calmoDezoito);
		

	}

}