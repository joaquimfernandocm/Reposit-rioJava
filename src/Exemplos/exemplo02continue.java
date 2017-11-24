package Exemplos;

public class exemplo02continue {
	public static void main (String[] args) {
		for (int i = 0; i < 100; i++) {
			if((i > 50 && i < 60) || (i > 80 && i < 90)) {
				System.out.println("Esse não entra! " + i);
				continue;
				
			}
			System.out.println(i);
		}
	}
}
