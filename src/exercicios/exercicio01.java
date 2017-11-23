package exercicios;
import java.util.Scanner;
public class exercicio01 {
	
	// ENUNCIADO
	// 1 - DESENVOLVA UM PROGRAMA PARA DADO O PREÇO DE UM PRODUTO, CALCULAR O NOVO PREÇO COM DESCONTO DE 9%
	
	public static void main(String[] args) {
		
		//DECLARAÇÃO DAS VARIÁVEIS
		
		Double preco;
		Double desconto;
		Double precofinal;
		
		//LEITURA DO TECLADO
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o preço para calcular o desconto: ");
		preco = scan.nextDouble();
		desconto = preco * 0.09;
		precofinal = preco-desconto;
		scan.close();
		
		System.out.println("\nDE: " + preco);
		System.out.println("\nPOR: " + precofinal);
		System.out.println("\nECONOMIZE: " + desconto);
		
	}
}
