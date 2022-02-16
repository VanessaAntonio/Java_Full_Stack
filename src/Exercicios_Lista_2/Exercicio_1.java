package Exercicios_Lista_2;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Informar todos os números de 1000 a 1999 
		 * que quando divididos por 11 obtemos resto = 5. (FOR)
		 */

int N;
		
		for (N = 1000 ; N <= 1999 ; N ++ ) {
			if (N %  11  ==  5 ) {
				System.out.println(N);
			}
		
		}
}
	
}