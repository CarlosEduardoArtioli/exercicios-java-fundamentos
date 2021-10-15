package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana: ");
		String diaSemana = entrada.next().toLowerCase();
		
		entrada.close();
		
		if (diaSemana.equals("domingo")) {
			System.out.println(1);
		} else if (diaSemana.equals("segunda")) {
			System.out.println(2);
		} else if (diaSemana.equals("terça") || diaSemana.equals("terca")) {
			System.out.println(3);
		} else if (diaSemana.equals("quarta")) {
			System.out.println(4);
		} else if (diaSemana.equals("quinta")) {
			System.out.println(5);
		} else if (diaSemana.equals("sexta")) {
			System.out.println(6);
		} else if (diaSemana.equals("sábado") || diaSemana.equals("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!");
		}
	}
}
