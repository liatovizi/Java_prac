package v3;

import v1.Person;

public class Generics {

    public static void main(String[] args) {

        Cat sziamiau = new Cat("Sziamiau");
        Box<Cat> boxedCat = new Box<>(sziamiau);
        Box<Person> boxedPerson = new Box<>(new Person("Józsi"));

        processBoxedCat(boxedCat);
        //processBoxedCat(boxedPerson);
        Pair<Cat, Integer> pair = new Pair<>(sziamiau, 5);
        Box<String> str = new Box<>();
    }

    private static void processBoxedCat(Box<Cat> catInABox) {
        Cat cat = catInABox.getValue();
        cat.feed("catfood", 2);
        System.out.println(cat);
    }
}