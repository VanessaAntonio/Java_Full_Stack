package Exercicios;

import java.util.Scanner;

public class PesoTomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exerc�cio1 
				/* Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
				 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
				 * deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates)
				 *  e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
				 *  Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
				 */
				
				double peso, excesso = 0, multa = 0;
				    Scanner leia = new Scanner (System.in);{
					System.out.println("\n Inofrme o peso dos tomates:");
					peso = leia.nextDouble() ;
					
			}
				
				if(peso<=50) {
					System.out.println("\n O peso (Kg) est� dento do permitido " + peso);
					System.out.println("\n O peso excente � : " + excesso);
					System.out.println("\n Multa a ser paga:"+ multa);
					
				}
				else {
					System.out.printf("\n O peso(kg) est� acima do permitido: %3.3f ", peso);
					peso = Math.ceil(peso);
					excesso = peso -50 ;
					System.out.println("\n O peso excedente �: "+ excesso);
					multa = 4 * excesso;
					System.out.println("\n Multa a ser paga: "+ multa);
					
						}
			}

		
	}
