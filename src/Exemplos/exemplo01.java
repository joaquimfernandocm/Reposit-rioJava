package Exemplos;

import java.util.Scanner;

public class exemplo01 {
	public static void main (String[] args) {
		int x;
		int y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA DADO DOS NÚMEROS DE ENTRADA, IRÁ PERCORRER ESSA \n" + "FAIXA VERIFICANDO SE EXISTEM ALGUM NÚMERO DIVISÍVEL POR 19\n");
		
		System.out.print("Digite o número inicial: ");
		x = teclado.nextInt();
		
		System.out.print("Digite o número final: ");
		y = teclado.nextInt();
		
		for (int i = x; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um número divisível por 19 entre x e y: " + i) ; break;
			}
		}
	}
}
