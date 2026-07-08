package streamsapi;

import main.Exercise;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 extends Exercise {

    public static void implementation() {
        System.out.println(visualDivisor);

        List<String> words = List.of("Java", "Java", "Stream", "API", "Java", "Code", "API", "Stream", "Test");
        List<String> words2 = words.stream()
                .distinct()
                .filter(word -> word.length() > 3)
                .sorted()
                .toList();

        int newSize = (int) words2.stream().count();
        System.out.println("Coleção inicial: " + words);
        System.out.println("Coleção final: " + words2);
        System.out.println("Tamanho final: " + newSize);
    }
}
