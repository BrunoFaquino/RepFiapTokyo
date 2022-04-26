package Aula06;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 7;
		
		boolean teste = num1 > num2;
		System.out.println(teste);
		
		boolean teste2 = num2 == 7;
		System.out.println(teste2);
		
		
		int num3 = 2;
		boolean teste3 = num3 == 2 || num3 == 23;
		System.out.println(teste3);
		
		if (num3 == 2 || num3 == 4) {
			System.out.println("O número é um dos primeiros numeros pares");
		}
	}

}
