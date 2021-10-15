package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50Polegadas = trabalho1 && trabalho2;
		boolean comprouTV32Polegadas = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean ficouMaisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou uma TV de 50 polegadas? " + comprouTV50Polegadas);
		System.out.println("Comprou uma TV de 32 polegadas? " + comprouTV32Polegadas);
		System.out.println("Comprou um sorvete? " + comprouSorvete);
		System.out.println("Ficou mais saudável? " + ficouMaisSaudavel);
	}

}
