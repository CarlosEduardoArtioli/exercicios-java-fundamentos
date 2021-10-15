package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		Double num1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		Double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação (+ - * / %): ");
		String operacao = entrada.next();
		
		entrada.close();
		
		String resultado = operacao.equals("+") ? "soma: " + (num1 + num2) : 
			(operacao.equals("-") ? "subtração: " + (num1 - num2) :
				operacao.equals("*") ? "multiplicação: " + (num1 * num2) : 
					operacao.equals("/") ? "divisão: " + (num1 / num2) :
						operacao.equals("%") ? "resto da divisão: " + (num1 % num2) : "Operação informada inválida");
		
		System.out.println("Resultado " + resultado);
	}
}
