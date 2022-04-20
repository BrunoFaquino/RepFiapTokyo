package Aula05;

import java.util.Scanner;

public class ManipulandoDados {

	public static void main(String[] args) {
		
		double salario = 1212.50;
		String salarioStr = Double.toString(salario);
	
		System.out.println(salarioStr);
		
		
		String precoStr = "2.99";
		
		double preco = Double.parseDouble(precoStr);
		
		System.out.println(preco);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		String numeroTxt = entrada.nextLine();
		
		float numero = Float.parseFloat(numeroTxt);
		System.out.println(numeroTxt);
		
		

	}

}
