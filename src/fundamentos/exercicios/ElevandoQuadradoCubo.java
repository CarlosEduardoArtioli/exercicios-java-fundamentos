package fundamentos.exercicios;

import java.util.Scanner;

public class ElevandoQuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double valor = Double.parseDouble(entrada.next().replace(",", "."));
		
		entrada.close();
		
		System.out.println(valor + " ^ 2 = " + Math.pow(valor, 2));
		System.out.println(valor + " ^ 3 = " + Math.pow(valor, 3));
	}
}
