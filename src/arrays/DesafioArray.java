package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quantas notas deseja inserir: ");
		int qtde = entrada.nextInt();
		
		double notas[] = new double[qtde];
		double total = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a %dª nota: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		for (double nota : notas) {
			total += nota;
		}
		
		System.out.println("Média: " + total / qtde);
		
		entrada.close();
	}
}
