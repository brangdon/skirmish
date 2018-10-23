package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.sort;

/**
 * Created by admin on 23.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot"};
        sort(animals, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(animals, sortByName);

//        Arrays.sort(animals, (String s1, String s2) -> (s1.compareTo(s2)));

        Arrays.asList(animals).forEach(a -> System.out.println(a));
        List fruits = Arrays.asList("apple", "banana", "cherry", "plum", "pear", "pinapple");
        fruits.stream().filter(s -> s.toString().startsWith("p")).map(s -> s.toString().toUpperCase()).sorted().forEach(System.out::println);
    }
}
