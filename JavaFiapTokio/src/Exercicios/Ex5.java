package Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		double salario = entrada.nextDouble();
		
		System.out.println("Você recebe: " + salario);
		
		entrada.close();
	}

}
