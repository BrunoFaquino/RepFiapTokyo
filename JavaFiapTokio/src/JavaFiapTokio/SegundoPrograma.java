package JavaFiapTokio;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
	
		// Entrada de dados
		// bagulho dificil mané
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu lindo nome: ");
		
		String nome = entrada.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		int idade = 18;
		System.out.println("Você tem " + idade + "anos ?");
		
		System.out.print("Digite sua idade: ");
		
		idade = entrada.nextInt();
		
		System.out.println("Sua nova idade é: " + idade);
		
		System.out.println("");
		
		System.out.println("Salve! " + nome + " Você tem " + idade + " anos");
		

	}

}
