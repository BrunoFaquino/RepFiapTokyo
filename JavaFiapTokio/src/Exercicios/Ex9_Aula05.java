package Exercicios;

import java.util.Scanner;

public class Ex9_Aula05 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite uma numero: ");
		int num = tec.nextInt();
		
		int centena = (num / 100) * 100;
		System.out.println("Centena = " + centena);
		
		int restoDezena = num - centena;
		
		int dezena = (restoDezena / 10) * 10;
		System.out.println("Dezena = " + dezena);
		
		int unidade = restoDezena - dezena;
		System.out.println("Unidade = " + unidade);
		

	}

}
