package Java8Features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* StreamAPI -> There uses of Stream in Java are mentioned below:
Stream API is a way to express and process collections of objects.
Enable us to perform operations like filtering, mapping,reducing and sorting.
operations performing using stream are : filter() , map() , sorted() by using 
terminal methods like collect() , forEach() , reduce().
*/

public class StreamExample {
    public static void main(String[] args) {

        // sorting
        List<String> list = Arrays.asList("hello", "world", "java");
        Stream<String> stm = list.stream();
        stm.forEach(System.out::println);

        System.out.println("***********************");

        Stream<String> stm2 = Stream.of("Hello", "Hi", "Bye");
        stm2.forEach(System.out::println);

        System.out.println("***********************");

        // list2
        List<String> list2 = new ArrayList<>();
        list2.add("Animals");
        list2.add("Plants");
        list2.add("Flowers");
        list2.add("Birds");
        list2.add("Houses");

        // Ascending Order
        list2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("***********************");
        // 2nd method
        list2.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("**********************");
        // 3rd method
        list2.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("***********************");
        // Decending Order
        list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("***********************");
        // 2 nd method
        List<String> desc = list2.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        desc.forEach(System.out::println);
        System.out.println("***********************");

        // mapping
        List<Integer> nums = Arrays.asList(5, 10, 20, 30, 40);
        List<Integer> squares = nums.stream().map((num -> num * num))
                .collect(Collectors.toList());
        squares.forEach(System.out::println);

        System.out.println("***********************");
        // double numbers
        nums.stream().map((num -> num * 2)).collect(Collectors.toList()).forEach(System.out::println);
    }

}
