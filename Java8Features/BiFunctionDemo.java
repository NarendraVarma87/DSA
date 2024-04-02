package Java8Features;

import java.util.function.BiFunction;

/* it takes three input datatypes input1 datatype, input2 datatype , Result datatype */
public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t + u);
        BiFunction<Integer, Integer, Integer> substraction = (t, u) -> (t - u);
        BiFunction<String, String, String> str = (t, u) -> (t.concat(u));
        BiFunction<String, String, Boolean> str2 = (in1, in2) -> (in1.equals(in2));

        System.out.println(biFunction.apply(130, 70)); //200
        System.out.println(substraction.apply(265, 123)); //142
        System.out.println(str.apply("Hello ", "World")); //Hello World
        System.out.println(str2.apply("narendra", "narendra")); //true
    }
}
