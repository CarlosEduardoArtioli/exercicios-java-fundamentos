package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um ano: ");
		int ano = entrada.nextInt();
		
		entrada.close();
		
		if (ano % 4 == 0) {
			System.out.println("O ano é bissexto");
		} else {
			System.out.println("O ano não é bissexto");
		}
	}
}
