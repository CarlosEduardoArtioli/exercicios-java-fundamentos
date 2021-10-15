package oo.composicao.umparamuitos;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		c1.itens.add(new Item("Caneta", 20, 7.45));
		c1.itens.add(new Item("Caneta", 20, 3.89));
		c1.itens.add(new Item("Caneta", 20, 18.79));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
	}
}
