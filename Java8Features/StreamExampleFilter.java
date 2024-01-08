package Java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamExampleFilter {
    public static void main(String[] args) {

        // filter
        List<String> str = Arrays.asList("Narendra", "Varma", "Uppalapati", "Visakhapatnam");
        str.stream().filter(letter -> letter.toLowerCase().startsWith("v")).forEach(op -> System.out.println(op));
        System.out.println("****************************************************");
        str.stream().filter(contains -> contains.toLowerCase().contains("ar")).forEach(System.out::println);

        System.out.println("****************Numbers***************");
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 10, 73);
        number.stream().filter(x -> x % 2 == 0).forEach(num -> System.out.println(num + " is a Even number"));

    }
}
