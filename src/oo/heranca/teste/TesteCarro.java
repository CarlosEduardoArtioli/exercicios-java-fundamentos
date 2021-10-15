package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		
		Ferrari ferrari = new Ferrari(400);
		
		System.out.println(civic);
		System.out.println(ferrari);
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println(civic);
		System.out.println(ferrari);
		
		civic.frear();
		ferrari.frear();
		

		ferrari.desligarAr();
		ferrari.desligarTurbo();
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println(civic);
		System.out.println(ferrari);
		
		System.out.println(ferrari.velocidadeDoAr());
	}
}
