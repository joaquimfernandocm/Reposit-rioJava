package Exemplos;

import java.util.Scanner;

public class exemplo01 {
	public static void main (String[] args) {
		int x;
		int y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA DADO DOS N�MEROS DE ENTRADA, IR� PERCORRER ESSA \n" + "FAIXA VERIFICANDO SE EXISTEM ALGUM N�MERO DIVIS�VEL POR 19\n");
		
		System.out.print("Digite o n�mero inicial: ");
		x = teclado.nextInt();
		
		System.out.print("Digite o n�mero final: ");
		y = teclado.nextInt();
		
		for (int i = x; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um n�mero divis�vel por 19 entre x e y: " + i) ; break;
			}
		}
	}
}
