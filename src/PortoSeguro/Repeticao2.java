package PortoSeguro;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabuada, x=1 , resultado;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n Entre com qual tabuada deseja entrar:");
		tabuada = leia.nextInt();
		
		do 
		{
			resultado = x* tabuada;
			System.out.println("\n "+ tabuada+ " X " +x+" " );
			x++;
		}
		while(x<=10);
		
	}

}
