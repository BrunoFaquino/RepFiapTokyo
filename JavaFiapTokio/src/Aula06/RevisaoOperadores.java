package Aula06;

import java.util.Scanner;

public class RevisaoOperadores {

	public static void main(String[] args) {
		
		/*
		float num1 = 4.0f;
		float num2 = 5.0f;
		
		float media = (num1 + num2) /2;
		
		System.out.println(media);
		
		
		
		int numero = 5;
		numero++;
		int valor = 5 + numero;
		System.out.println(+-valor);

	*/
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua nota?: ");
		
		int nota = entrada.nextInt();
		
		
		if (nota < 4) {
			System.out.println("Reprovado, daqui pra frente só pra trás");
		} else if (nota < 6) {
				System.out.println("Ta de recuperação");
		}	else {
				System.out.println("Aprovado zika do baile");
			}
			
		}
		
	}
	


