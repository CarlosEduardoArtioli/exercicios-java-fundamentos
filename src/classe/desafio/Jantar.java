package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Cadu", 75.0);
		
		Comida c1 = new Comida("Arroz", 0.250);
		Comida c2 = new Comida("Feijão", 0.300);
		
		System.out.println(p1.nome + " " + p1.peso);
		
		p1.comer(c1);
		p1.comer(c2);
		
		System.out.println(p1.nome + " " + p1.peso);
	}
}
