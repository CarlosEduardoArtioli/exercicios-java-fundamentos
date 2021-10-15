package controle.exercicios;

import java.util.Scanner;

public class ParEntre0a10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		
		entrada.close();
		
		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				System.out.println("O número informado está entre 0 e 10 e é par");
			} else {
				System.out.println("O número informado está entre 0 e 10 mas não é par");
			}
		} else {
			System.out.println("O número informado não está entre 0 e 10");
		}
	}
}
