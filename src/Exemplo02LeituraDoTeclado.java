

import java.util.Scanner;
public class Exemplo02LeituraDoTeclado {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in); // "NEW SCANNER" CRIA O OBJETO "SCANNER"
	    System.out.print("Digite um n�mero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.println("\nO N�mero lido foi: " + numero);
	}
}
