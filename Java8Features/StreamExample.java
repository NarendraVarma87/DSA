package Java8Features;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "java");
        Stream<String> stm = list.stream();
        stm.forEach(System.out::println);

        System.out.println("***********************");

        Stream<String> stm2 = Stream.of("Hello", "Hi", "Bye");
        stm2.forEach(System.out::println);

        System.out.println("***********************");

        // ascending order
        List<String> list2 = new ArrayList<>();
        list2.add("Animals");
        list2.add("Plants");
        list2.add("Flowers");
        list2.add("Houses");
        for (String ls : list2) {
            System.out.println(ls);
        }
    }

}
