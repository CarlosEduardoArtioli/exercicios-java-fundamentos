package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimoCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		
		entrada.close();
		
		int cont = 0;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}

		switch (cont) {
		case 0:
			System.out.println("O número é primo");
			break;
		default:
			System.out.println("O número não é primo");
		}
	}
}
