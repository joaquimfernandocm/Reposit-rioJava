package app;

import java.util.Scanner;

import entidade.Cliente;
import entidade.Telefone;

public class Aplicativo {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		Telefone t = new Telefone();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ID: ");		
		c.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o nome: ");
		c.setNome(scan.nextLine());
		System.out.print("Informe a idade: ");
		c.setIdade(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o ID do telefone: ");
		t.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o numero do telefone: ");
		t.setNumero(scan.nextLine());
		
		scan.close();
		
		// \n PULA A LINHA!
		System.out.println("\n\n\nO ID informado: " + c.getId());
		System.out.println("O nome informado: " + c.getNome());
		System.out.println("A idade informada: " + c.getIdade());
		
	}
}