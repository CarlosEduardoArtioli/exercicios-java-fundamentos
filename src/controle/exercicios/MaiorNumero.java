package controle.exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int maiorNum = -999999;
		int num = -999999;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o " + i + " número: ");
			num = entrada.nextInt();
			
			if (num > maiorNum) {
				maiorNum = num;
			}
		}
		
		System.out.println(maiorNum);
		
		entrada.close();
	}
}
