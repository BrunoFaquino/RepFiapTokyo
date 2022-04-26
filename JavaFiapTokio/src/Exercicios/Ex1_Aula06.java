package Exercicios;

import java.util.Scanner;

public class Ex1_Aula06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		if (num%2 == 0) {
			System.out.println("O número é par");
			
		} else {
			System.out.println("O número é ímpar");
			
		}

	}

}
