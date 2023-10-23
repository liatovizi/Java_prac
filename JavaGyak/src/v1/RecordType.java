package v1;

import java.util.List;

public class RecordType {

    public static void main(String[] args) {
        Person lia = new Person("Lia", 100);

        System.out.println(lia);
        System.out.println("Mi nombre es: " + lia.name());
        Person nexi = new Person("Nexi", 15);

        System.out.println(lia.equals(nexi));

        System.out.println(lia.getClass().getSuperclass());

        record Pair(String a, String b) {}
        Pair pair = new Pair("apple", "orange");
        System.out.println(pair);

        System.out.println(algo());
    }

    private static List<Object> algo() {
        record Pair(String a, String b) {}
        Pair pair = new Pair("apple", "orange");
        System.out.println(pair);
        return List.of(pair);
    }
}
