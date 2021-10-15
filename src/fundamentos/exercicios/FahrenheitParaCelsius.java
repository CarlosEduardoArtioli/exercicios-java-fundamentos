package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		entrada.close();
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.printf("O resultado é: " + celsius + "ºC.");
	}
}
