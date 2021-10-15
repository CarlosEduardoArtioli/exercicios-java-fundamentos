package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e incialização da variável
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..."; (Não é possivel trocar o tipo de uma variável)
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // Variável foi declarada
		d = 123.56; // Variável foi inicializada
		System.out.println(d); // Usada!
		
		var f = 12;
		// f = 12.01;
		System.out.println(f);
	}
}
