package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Produto p = new Produto("iPad", 3235.89, 0.13);

        /*
        * 1. A partir do produto calcular o preco real (com desconto)
        * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Insento)
        * 3. Frete: >= 3000 (100) / < 3000 (50)
        * 4. Arredondar: Deixar duas casas decimais
        * 5. Formatar: R$1234,56
        */

        Function<Produto, Double> precoComDesconto =
                produto -> produto.preco - (produto.preco * produto.desconto);
        UnaryOperator<Double> imposto =
                preco -> preco >= 2500 ? preco + (preco * 0.085) : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> precoArredondado =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> "R$" + preco.toString().replace(".", ",");

        String precoFormatado = precoComDesconto
                .andThen(imposto)
                .andThen(frete)
                .andThen(precoArredondado)
                .andThen(formatar)
                .apply(p);
        System.out.println(precoFormatado);
    }
}
