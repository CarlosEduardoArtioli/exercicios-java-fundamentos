package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		final double AJUSTE = 32;
		final double FATOR = 9.0/5.0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em celsius: ");
		double celsius = entrada.nextDouble();
		
		entrada.close();
		
		double fahrenheit = (celsius * FATOR) + AJUSTE;
		System.out.printf("O resultado é: " + fahrenheit + "ºF.");
	}
}
