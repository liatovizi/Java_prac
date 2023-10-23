package v5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        String[] namesArray = {"Peti", "Béla", "Éva", "Kata", "Gyuri", "Zoli"};
        List<String> cities = List.of("Budapest", "Debrecen", "Miskolc", "Sátoraljaújhely");

        
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Üres: " + emptyStream.count());

        
        Stream<String> fruits = Stream.of("alma", "körte", "barack", "szilva", "dió");
        System.out.println("Gyümölcsök listája: ");
        fruits.forEach(fruit -> System.out.println(fruit));

        Stream<String> singleItemStream = Stream.of("kutya");
        Stream<Object> anotherEmptyStream = Stream.ofNullable(null);

        
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("répa");
        builder.accept("retek");

        builder.add("káposzta")
                .add("uborka");
        Stream<String> vegetables = builder.build();

        Stream<String> letters = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();

        
        Random random = new Random();
        Stream<Integer> fixValueStream = Stream.generate(() -> random.nextInt(100)).limit(5);
        System.out.println("Fix értékek:");
        fixValueStream.forEach(System.out::println);

        
        System.out.println("Kettő hatványai: ");
        Stream.iterate(1, n -> n * 2).limit(5).forEach(System.out::println);
        System.out.println("Számok 0-tól:");
        Stream.iterate(0, i -> i < 5, i -> i + 1).forEach(System.out::println);

        // array
        Stream<String> namesStream = Arrays.stream(namesArray);

        // collection
        Stream<String> citiesStream = cities.stream();
        long count = Set.of("egy", "kettő", "három").stream().count();
    }
}