package streamsapi;

import main.Exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 extends Exercise {

    public static void implementation() {
        System.out.println(visualDivisor);
        System.out.println("Dado uma lista de números inteiros, utilize Streams para:\n" +
                "1. Filtrar apenas números pares\n" +
                "2. Mapear cada número para seu quadrado\n" +
                "3. Retornar como uma lista ordenada");

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> nums2 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map( n -> n * n)
                .sorted()
                .toList();
    }
}
