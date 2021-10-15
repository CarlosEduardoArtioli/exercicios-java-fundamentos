package controle.exercicios;

import java.util.Scanner;

public class WhilePositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		while (num >= 0) {
			System.out.print("Informe um número: ");
			num = entrada.nextInt();
			total += num;
			
			System.out.println("Soma: " + total);
		}
		
		entrada.close();
	}
}
