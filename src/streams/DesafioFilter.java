package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Escova de dentes", 10.2, false);
        Produto p2 = new Produto("PS4", 3600.99, true);
        Produto p3 = new Produto("Coca-cola 350ml", 5.9, false);
        Produto p4 = new Produto("Skate", 398.90, true);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        produtos.stream()
                .filter(produto -> produto.getPreco() <= 400)
                .filter(Produto::getFreteGratuito)
                .map(produto -> "O produto " + produto.getNome() + " está com frete grátis e com preço abaixo de 400 reais!")
                .forEach(System.out::println);
    }
}
