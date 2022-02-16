package PortoSeguro;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] media = new float [5];
		String []nomeAluno = new String[5];
		float n1,n2,n3,somaMedia=0, mediaGeral;
		int x, aprovados = 0;
		
		Scanner leia = new Scanner ( System.in);
		
		for (x=0; x<5;x++)
		{
			System.out.println("\n Notas de aluno" + (x+1));
			System.out.println("\n entre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\n Intervalo de notas incorreto, digite uma nota entre 0 á 10, \n entre com a primeira nota: " );
				n1= leia.nextFloat();
				}
			
			System.out.println("\n entre com a segunda nota:");
			n2= leia.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\n Intervalo de notas incorreto, digite uma nota entre 0 á 10 \n entre com a segunda nota:" );
				n2= leia.nextFloat();
				}
			System.out.println("\n entre com a terceira nota:");
			n3= leia.nextFloat();
			while(n3<0 || n3>10)
			{
				System.out.println(" \n Intervalo de notas incorreto, digite uma nota entre 0 á 10, \n entre com a terceira nota:" );
				n3= leia.nextFloat();
							
			}
			
			media[x] = (n1+n2+n3) / 3;
			
			if(media[x]>=7 && media[x]<=10) 
			{ 
				System.out.println(" \n Aluno Aprovado!!!");
				aprovados++;
			}
			
			else if (media[x]>=5 && media[x] <7) 
			{
				System.out.println("\n Aluno de Exame !!!!");
			}
			
			else 
			{ 
				System.out.println("\n Aluno Reprovado!!!");
			}
				
			
			System.out.println("\n Média: " +media[x]);
			
			somaMedia += media[x];
			
		}

		mediaGeral = somaMedia / x;
		
		System.out.println("\n Média Geral: " + mediaGeral);
		System.out.println("Tivesmos :" +aprovados+ " alunos (s) aprovado (s)" );
		
		
	}

	
	}


