package fundamentos.exercicios;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso: ");
		double peso = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.print("Informe a altura: ");
		double altura = Double.parseDouble(entrada.next().replace(",", "."));
		
		entrada.close();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("IMC: " + imc);
	}
}
