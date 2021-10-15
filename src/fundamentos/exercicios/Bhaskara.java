package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o A: ");
		double a = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.print("Informe o B: ");
		double b = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.print("Informe o C: ");
		double c = Double.parseDouble(entrada.next().replace(",", "."));
		
		entrada.close();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("Fórmula: " + a + "x² + " + b + "x + " + c);
		System.out.println("Delta: " + b + "² - 4 * " + a + " * " + c);
		System.out.println("Resultado Delta: " + delta);
	}
}
