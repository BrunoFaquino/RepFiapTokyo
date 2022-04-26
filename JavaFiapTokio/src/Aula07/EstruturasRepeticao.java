package Aula07;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.println("Digite um numero: ");
		num = tec.nextInt();
		soma = soma + num;
		
		System.out.println("Digite um numero: ");
		num = tec.nextInt();
		soma = soma + num;
		
		
		System.out.println("Digite um numero: ");
		num = tec.nextInt();
		soma = soma + num;
		
		System.out.println(soma);
	}

}
