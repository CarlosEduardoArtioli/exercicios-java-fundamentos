package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
