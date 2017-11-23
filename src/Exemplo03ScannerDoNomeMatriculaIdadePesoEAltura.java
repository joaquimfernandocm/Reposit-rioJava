import java.util.Scanner;
public class Exemplo03ScannerDoNomeMatriculaIdadePesoEAltura {
		public static void main(String[] args) {
			
			//DECLARAÇÃO DAS VÁRIAVEIS
	
			Long matricula;
			String nome;
			Integer idade;
			Double peso;
			Float altura;
			
			//LEITURA DO TECLADO
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Informe a matrícula da pessoa: ");
			matricula =  Long.parseLong(scan.nextLine());
			
			System.out.print("Informe o nome da pessoa: ");
			nome = scan.nextLine();
			
			System.out.print("Informe a idade da pessoa: ");
			idade = Integer.parseInt(scan.nextLine());
			
			System.out.print("Informe o peso da pessoa: ");
			peso = Double.parseDouble(scan.nextLine());
			
			System.out.print("Informe a altura da pessoa: ");
			altura = Float.parseFloat(scan.nextLine());
			
			scan.close();
			
			System.out.println(
					"Os dados informados foram :\n"
					
					//ESSE \T ESTA SENDO USADO PARA TABULAR A LINHA, CRIAR  UM ESPAÇO INICIAL.
					+ "\tMatrícula: " + matricula
					+ "\n\tNome: " + nome
					+ "\n\tIdade: " + idade
					+ "\n\tPeso: " + peso
					+ "\n\tAltura: " + altura
					);
		};
}
	
