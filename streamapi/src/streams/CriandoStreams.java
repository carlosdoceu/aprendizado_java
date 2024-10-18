package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<Integer> println = System.out::println;

        Stream<String> language = Stream.of("Java", "JavaScript", "C#", "Python\n");
        language.forEach(print);

        String maisLanguages[] = { "Python", "GoLang", "Perl", "PHP\n" };

        Stream.of(maisLanguages).forEach(print);
        Arrays.stream(maisLanguages).forEach(print);
        Arrays.stream(maisLanguages, 1, 3).forEach(print);

        System.out.println("\n");
        List<String> outrasLangs = Arrays.asList("C", "Kotlin", "Ruby", "Swift");

        outrasLangs.stream().forEach(print);
        System.out.println("\n");

        outrasLangs.parallelStream().forEach(print);

        // Stream.generate(()->"a").forEach(print);
        // Stream.iterate(0, n-> n+1).forEach(println);

    }
}
