package Exercicios;

import java.util.Scanner;

public class PesoTomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercício1 
				/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
				 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
				 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates)
				 *  e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
				 *  Caso contrário mostrar tais variáveis com o conteúdo ZERO.
				 */
				
				double peso, excesso = 0, multa = 0;
				    Scanner leia = new Scanner (System.in);{
					System.out.println("\n Inofrme o peso dos tomates:");
					peso = leia.nextDouble() ;
					
			}
				
				if(peso<=50) {
					System.out.println("\n O peso (Kg) está dento do permitido " + peso);
					System.out.println("\n O peso excente é : " + excesso);
					System.out.println("\n Multa a ser paga:"+ multa);
					
				}
				else {
					System.out.printf("\n O peso(kg) está acima do permitido: %3.3f ", peso);
					peso = Math.ceil(peso);
					excesso = peso -50 ;
					System.out.println("\n O peso excedente é: "+ excesso);
					multa = 4 * excesso;
					System.out.println("\n Multa a ser paga: "+ multa);
					
						}
			}

		
	}
