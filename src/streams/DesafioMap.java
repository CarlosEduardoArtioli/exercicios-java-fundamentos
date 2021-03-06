package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
        * 1. Número para string binária... 6 => "110"
        * 2. Reverter a string... "110" => "011"
        * 3. Converter de volta para inteiro... "011" => 3
        */

        nums.stream()
                .map(Integer::toBinaryString)
                .map(b -> new StringBuilder(b).reverse().toString())
                .map(b -> Integer.parseInt(b, 2))
                .forEach(System.out::println);
    }
}
