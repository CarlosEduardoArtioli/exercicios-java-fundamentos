package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> Obtem o proximo elemento da fila (sem remover)
		// Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		// Poll e Remove -> Obtem o proximo elemento da fila e remove
		// Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
	}
}
