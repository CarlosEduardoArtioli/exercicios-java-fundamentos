package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdeNotas = 0;
		double nota = 0;
		double totalNotas = 0;
		double media = 0;
		
		while (nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >=0) {
				totalNotas += nota;
				qtdeNotas++;
			}
		}
		
		media = totalNotas / qtdeNotas;
		System.out.println("Média: " + media);
		
		entrada.close();
	}
}
