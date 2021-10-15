package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String salario1 = entrada.nextLine();
		
		System.out.print("Informe o segundo salário: ");
		String salario2 = entrada.nextLine();
		
		System.out.print("Informe o terceiro salário: ");
		String salario3 = entrada.nextLine();
		
		entrada.close();
		
		double valorSalario1 = Double.parseDouble(salario1.replace(",", "."));
		double valorSalario2 = Double.parseDouble(salario2.replace(",", "."));
		double valorSalario3 = Double.parseDouble(salario3.replace(",", "."));
		
		double media = (valorSalario1 + valorSalario2 + valorSalario3) / 3;
		
		System.out.println("\nMédia dos salários: " + media);
	}

}
