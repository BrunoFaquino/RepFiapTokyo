package Exercicios;

import java.util.Scanner;

public class Ex2_Aula06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero �:" +num1);
			
		} else if (num2 > num1) {
			System.out.println("O maior n�mero �"  +num2);
			
		} else {
			System.out.println("Os numeros sao iguais");
		}
		

	}

}
