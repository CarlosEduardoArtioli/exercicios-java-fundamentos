package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base do triângulo: ");
		double base = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.print("Informe a altura do triângulo: ");
		double altura = Double.parseDouble(entrada.next().replace(",", "."));
		
		entrada.close();
		
		double area = (base * altura) / 2;
		
		System.out.println("Área do triângulo: " + area);
	}
}
