package Exercicios;

import java.util.Scanner;

public class Ex1_Aula06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = entrada.nextInt();
		
		if (num%2 == 0) {
			System.out.println("O n�mero � par");
			
		} else {
			System.out.println("O n�mero � �mpar");
			
		}

	}

}
