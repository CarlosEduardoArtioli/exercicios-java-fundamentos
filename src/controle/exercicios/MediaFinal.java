package controle.exercicios;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		entrada.close();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}
}
