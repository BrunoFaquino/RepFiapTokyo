package Aula05;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		float nota = 9.5f;

	
		System.out.printf("Sua nota �: %.2f \n", nota);
		System.out.format("Sua nota �: %.1f \n", nota);
		
		String nome = "Joao";
		
		System.out.printf("O %s tirou: %.3f", nome, nota);
	}

}
